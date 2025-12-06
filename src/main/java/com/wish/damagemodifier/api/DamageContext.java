package com.wish.damagemodifier.api;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class DamageContext {
    public final Player attacker;
    public final Entity victim;
    public final double baseDamage;
    public final String cause;
    public final boolean projectile;
    public final String weaponType;
    public final String projectileType;

    public DamageContext(Player attacker, Entity victim, double baseDamage, String cause, boolean projectile, String weaponType, String projectileType) {
        this.attacker = attacker;
        this.victim = victim;
        this.baseDamage = baseDamage;
        this.cause = cause;
        this.projectile = projectile;
        this.weaponType = weaponType;
        this.projectileType = projectileType;
    }
}

