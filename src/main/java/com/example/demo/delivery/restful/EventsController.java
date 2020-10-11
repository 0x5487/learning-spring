package com.example.demo.delivery.restful;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Logger;
import com.example.demo.config.JavaConfigBean;
import com.example.demo.domain.*;
import com.example.demo.usecase.*;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@EnableApolloConfig
@RestController
@RequestMapping(value = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
public class EventsController {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private JavaConfigBean configBean;

    @GetMapping
    public ResponseEntity<APICollection> listEvents() {
        var result = new APICollection();

        var usecase = new ListEventUsecase();
        var events = usecase.listEvents();

        result.data = events;
        result.metadata.put("key", "abc");

        // get config
        logger.info("answer:" + configBean.getTimeout());

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
