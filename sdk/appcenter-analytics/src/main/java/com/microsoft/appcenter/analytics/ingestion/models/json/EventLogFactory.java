package com.microsoft.appcenter.analytics.ingestion.models.json;

import com.microsoft.appcenter.analytics.ingestion.models.EventLog;
import com.microsoft.appcenter.ingestion.models.json.AbstractLogFactory;

public class EventLogFactory extends AbstractLogFactory {

    @Override
    public EventLog create() {
        return new EventLog();
    }
}
