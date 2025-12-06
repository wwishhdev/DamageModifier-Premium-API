package com.wish.damagemodifier.events;

import com.wish.damagemodifier.api.DamageContext;
import com.wish.damagemodifier.api.DamageReport;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DamageComputeEndEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final DamageContext context;
    private final DamageReport report;

    public DamageComputeEndEvent(DamageContext context, DamageReport report) {
        this.context = context;
        this.report = report;
    }

    public DamageContext getContext() {
        return this.context;
    }

    public DamageReport getReport() {
        return this.report;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

