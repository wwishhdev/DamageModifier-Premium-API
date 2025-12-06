package com.wish.damagemodifier.api;

public interface ContributionProvider {
    void apply(DamageContext context, DamageAccumulator acc);
}

