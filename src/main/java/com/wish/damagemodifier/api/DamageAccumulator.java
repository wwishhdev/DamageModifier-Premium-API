package com.wish.damagemodifier.api;

import java.util.ArrayList;
import java.util.List;

public class DamageAccumulator {
    private double multiplier;
    private double addition;
    private final List<DamageReport.Contribution> contributions;
    private double capMin;
    private double capMax;

    public DamageAccumulator() {
        this.multiplier = 1.0D;
        this.addition = 0.0D;
        this.contributions = new ArrayList<>();
        this.capMin = -1.0D;
        this.capMax = -1.0D;
    }

    public void addMultiplier(String name, double value) {
        this.multiplier *= value;
        this.contributions.add(new DamageReport.Contribution(name, "multiplier", value));
    }

    public void addAddition(String name, double value) {
        this.addition += value;
        this.contributions.add(new DamageReport.Contribution(name, "addition", value));
    }

    public void setCap(double min, double max) {
        this.capMin = min;
        this.capMax = max;
    }

    public double apply(double input) {
        double out = input * this.multiplier + this.addition;
        if (this.capMin >= 0.0D && out < this.capMin) out = this.capMin;
        if (this.capMax >= 0.0D && out > this.capMax) out = this.capMax;
        return out;
    }

    public List<DamageReport.Contribution> getContributions() {
        return this.contributions;
    }
}

