package com.example.demo.delivery.restful;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.usecase.*;

import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
public class EventsController {

    @GetMapping
    public ResponseEntity<APICollection> listEvents() {
        var result = new APICollection();

        var usecase = new ListEventUsecase();
        var events = usecase.listEvents();

        result.data = events;
        result.metadata.put("key", "abc");

        return ResponseEntity.ok().body(result);
    }

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event request) {

        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/error")
    public String getLiveList(@RequestParam Long status) {
        status.toString();
        return "my error";
    }
}
