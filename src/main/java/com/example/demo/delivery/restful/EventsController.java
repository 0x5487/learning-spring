package com.example.demo.delivery.restful;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.domain.Event;
import com.example.demo.domain.ListEventUsecase;
import com.example.demo.usecase.ListEvent;

import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
public class EventsController {

    @GetMapping
    public ResponseEntity<List<Event>> listEvents() {
        ListEventUsecase usecase = new ListEvent();

        List<Event> events = usecase.ListEvents();

        return ResponseEntity.ok().body(events);
    }
}
