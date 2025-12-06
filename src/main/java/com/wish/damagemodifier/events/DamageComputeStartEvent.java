package com.wish.damagemodifier.events;

import com.wish.damagemodifier.api.DamageContext;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DamageComputeStartEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final DamageContext context;

    public DamageComputeStartEvent(DamageContext context) {
        this.context = context;
    }

    public DamageContext getContext() {
        return this.context;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

