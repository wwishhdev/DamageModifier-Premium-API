---
title: DamageModifier‑Premium API
---

# DamageModifier‑Premium API

Config‑driven combat balancer API for Modern (1.9+) and Legacy (1.8). This API lets your plugin add damage contributions via a simple provider pipeline and listen to compute events.

## Supported Editions

- Modern (1.9+): `com.wish.damagemodifier.DamageModifier`
- Legacy (1.8): `com.wish.damagemodifier.DamageModifierLegacy`
- Both expose the same API packages: `com.wish.damagemodifier.api` and `com.wish.damagemodifier.events`.

## Quick Setup (JitPack)

Add JitPack to your build and depend on the stub:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.wwishhdev</groupId>
  <artifactId>DamageModifier-Premium-API</artifactId>
  <version>v1.5.1</version>
  <scope>provided</scope>
</dependency>
```

`plugin.yml`:

```yaml
softdepend: [DamageModifier-Premium]
```

Get the service in runtime:

```java
org.bukkit.plugin.Plugin dm = Bukkit.getPluginManager().getPlugin("DamageModifier-Premium");
com.wish.damagemodifier.api.DamageService svc = null;
if (dm instanceof com.wish.damagemodifier.DamageModifier) {
  svc = ((com.wish.damagemodifier.DamageModifier) dm).getDamageService();
} else if (dm instanceof com.wish.damagemodifier.DamageModifierLegacy) {
  svc = ((com.wish.damagemodifier.DamageModifierLegacy) dm).getDamageService();
}
```

## Pages

- [API Reference](api.md)
- [Setup](setup.md)
- [Examples](examples.md)
- [FAQ](faq.md)

