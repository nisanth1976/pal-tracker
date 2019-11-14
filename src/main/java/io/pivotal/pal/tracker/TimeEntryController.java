package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

@RestController
public class TimeEntryController {

    @Autowired
    private TimeEntryRepository timeEntryRepository;

    private TimeEntry timeEntry;
    private long timeEntryId;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository =timeEntryRepository;
    }

    @PostMapping(path= "/time-entries")
    public ResponseEntity create(@RequestBody TimeEntry timeEntryToCreate) {
        TimeEntry result = timeEntryRepository.create(timeEntryToCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping(path= "/time-entries/{id}")
    public ResponseEntity read(@PathVariable("id") long nonExistentTimeEntryId) {
        TimeEntry result = timeEntryRepository.find(nonExistentTimeEntryId);

        if(result != null)
            return ResponseEntity.ok(result);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping(path= "/time-entries/{id}")
    public ResponseEntity delete(@PathVariable("id") long timeEntryId) {
        timeEntryRepository.delete(timeEntryId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping(path= "/time-entries")
    public ResponseEntity<List<TimeEntry>> list() {
        return ResponseEntity.ok(timeEntryRepository.list());
    }

    @PutMapping(path= "/time-entries/{id}")
    public ResponseEntity update(@PathVariable("id") long timeEntryId, @RequestBody TimeEntry timeEntryUpdated) {
        TimeEntry result = timeEntryRepository.update(timeEntryId, timeEntryUpdated);

        if(result != null)
            return ResponseEntity.status(HttpStatus.OK).body(result);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
