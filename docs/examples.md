---
title: Examples
---

# Examples

## Provider: Melee Bonus

```java
public class MeleeBoostProvider implements ContributionProvider {
  @Override
  public void apply(DamageContext ctx, DamageAccumulator acc) {
    if ("MELEE".equals(ctx.cause)) acc.addMultiplier("MeleeBoost", 1.10);
  }
}
```

## Listener: End Event

```java
@EventHandler
public void onEnd(DamageComputeEndEvent e) {
  DamageReport r = e.getReport();
  Bukkit.getLogger().info("final=" + r.finalDamage + " base=" + r.baseDamage);
}
```

## QA in‑server

1. `/damagemodifier debug next` → perform one hit.
2. You will see “ProvidersOut” with the post‑providers result.
3. `/damagemodifier simulate melee 5.0` → the output includes your provider.

