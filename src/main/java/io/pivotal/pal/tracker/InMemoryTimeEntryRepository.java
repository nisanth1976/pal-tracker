package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTimeEntryRepository {
    private TimeEntry timeEntry;

    public TimeEntry create(TimeEntry timeEntry) {
        this.timeEntry = timeEntry;
        return this.timeEntry;
    }

    public TimeEntry find(long timeEntryId) {
        return timeEntry;
    }

    public TimeEntry update(long l, TimeEntry timeEntry) {
        this.timeEntry = timeEntry;
        return this.timeEntry;
    }

    public List<TimeEntry> delete(long id) {
        return new ArrayList<TimeEntry>();
    }

}
