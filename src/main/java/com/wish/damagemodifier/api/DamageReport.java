package com.wish.damagemodifier.api;

import java.util.List;
import java.util.UUID;

public class DamageReport {
    public static class Contribution {
        public final String name;
        public final String type;
        public final double value;
        public Contribution(String name, String type, double value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }
    }

    public final UUID attackerId;
    public final UUID victimId;
    public final double baseDamage;
    public final double finalDamage;
    public final String cause;
    public final boolean projectile;
    public final List<Contribution> contributions;
    public final long timestamp;

    public DamageReport(UUID attackerId, UUID victimId, double baseDamage, double finalDamage, String cause, boolean projectile, List<Contribution> contributions, long timestamp) {
        this.attackerId = attackerId;
        this.victimId = victimId;
        this.baseDamage = baseDamage;
        this.finalDamage = finalDamage;
        this.cause = cause;
        this.projectile = projectile;
        this.contributions = contributions;
        this.timestamp = timestamp;
    }
}

