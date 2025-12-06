---
title: FAQ
---

# FAQ

## Premium: Modern vs Legacy

Both expose the same API; Modern (1.9+) and Legacy (1.8) differ in internal mechanics, but your integration code is identical.

## Why “provided/compileOnly”?

So your plugin does not package the stub. At runtime, the server uses the premium jar which provides the real classes.

## Bow/Crossbow vs Projectiles

Bow/Crossbow (weapon‑based) multiply based on the weapon. `projectiles.arrows` (entity‑level) adjusts damage/velocity/inaccuracy per arrow type. They can be combined; if you don’t want stacking, leave one at 1.0.

## Debug & Simulate

`/damagemodifier debug next` prints a breakdown of the next hit. `simulate` applies providers over a baseDamage only.
