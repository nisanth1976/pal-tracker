package io.pivotal.pal.tracker;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Component
public class TimeEntryRepository {
    private TimeEntry timeEntry;
    private long id;

    public TimeEntry create(TimeEntry timeEntry) {
        this.timeEntry = timeEntry;
        this.id = timeEntry.getId();
        return this.timeEntry;
    }

    public TimeEntry update(long idToUpdate, TimeEntry updatedTimeEntry) {
        if(this.id == idToUpdate)
            this.timeEntry = updatedTimeEntry;
        else
            return null;
        return this.timeEntry;
    }

    public boolean delete(long timeEntryId) {
        if(this.id == timeEntryId) {
            this.timeEntry = null;
            return true;
        }
        else
            return true;
    }


    public TimeEntry find(long timeEntryId) {
        if(this.id == timeEntryId)
            return this.timeEntry;
        else
            return null;

    }

    public List<TimeEntry> list() {
        return asList(this.timeEntry);
    }
}
