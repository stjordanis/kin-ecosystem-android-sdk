package com.kin.ecosystem.core.bi.events;

import java.util.UUID;

public interface CommonReadonly {
    UUID getEventId();

    String getVersion();

    String getUserId();

    Long getTimestamp();

    String getPlatform();

}
