---
title: Setup
---

# Setup

## Maven

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

## Gradle

```gradle
repositories { maven { url 'https://jitpack.io' } }
dependencies { compileOnly 'com.github.wwishhdev:DamageModifier-Premium-API:v1.5.1' }
```

## Runtime

```yaml
softdepend: [DamageModifier-Premium]
```

```java
org.bukkit.plugin.Plugin dm = Bukkit.getPluginManager().getPlugin("DamageModifier-Premium");
com.wish.damagemodifier.api.DamageService svc = null;
if (dm instanceof com.wish.damagemodifier.DamageModifier) {
  svc = ((com.wish.damagemodifier.DamageModifier) dm).getDamageService();
} else if (dm instanceof com.wish.damagemodifier.DamageModifierLegacy) {
  svc = ((com.wish.damagemodifier.DamageModifierLegacy) dm).getDamageService();
}
```

