---
title: FAQ
---

# FAQ

## ¿Premium Modern vs Legacy?

Ambos exponen la misma API; Modern (1.9+) y Legacy (1.8) difieren en mecánicas internas pero tu código de integración es idéntico.

## ¿Por qué “provided/compileOnly”?

Para que tu plugin no empaquete el stub. En runtime, el servidor usa el jar premium que trae las clases reales.

## Bow/Crossbow vs Projectiles

Bow/Crossbow (weapon‑based) multiplican según el arma. `projectiles.arrows` (entity‑level) ajusta daño/velocidad/inaccuracy por tipo de flecha. Se pueden combinar; si no querés stack, dejá uno en 1.0.

## Debug & Simulate

`/damagemodifier debug next` imprime breakdown del próximo golpe. `simulate` aplica solo providers sobre un baseDamage.

