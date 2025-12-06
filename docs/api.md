---
title: API Reference
---

# API Reference

## Packages

- `com.wish.damagemodifier.api`
  - `ContributionProvider`: `void apply(DamageContext ctx, DamageAccumulator acc)`
  - `DamageContext`: attacker, victim, baseDamage, cause (`MELEE`, `ARROW`, `TRIDENT`, `CRYSTAL`), projectile, weaponType, projectileType
  - `DamageAccumulator`: `addMultiplier`, `addAddition`, `setCap(min,max)`, `apply(input)`, `getContributions()`
  - `DamageReport`: `baseDamage`, `finalDamage`, `contributions`, `timestamp`
  - `DamageService`: `registerProvider`, `applyProviders`

- `com.wish.damagemodifier.events`
  - `DamageComputeStartEvent`: exposes `DamageContext`
  - `DamageComputeEndEvent`: exposes `DamageContext` + `DamageReport`

## Semantics

1. Start → Providers → Accumulator → End.
2. Your providers add multipliers/additions and optional caps.
3. The plugin premium aplica rounding y caps globales según su configuración.

