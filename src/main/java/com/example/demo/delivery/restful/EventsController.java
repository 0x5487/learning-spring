package com.example.demo.delivery.restful;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

import com.example.demo.config.AppConfig;
import com.example.demo.config.JavaConfigBean;
import com.example.demo.domain.*;
import com.example.demo.usecase.*;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@EnableApolloConfig
@RestController
@Slf4j
@RequestMapping(value = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
public class EventsController {

    @Autowired
    private AppConfig configBean;

    @Autowired
    private ListEventUsecase usecase;

    @GetMapping("")
    public ResponseEntity<APICollection> listEvents() {
        log.info("=====> begin list events");
        var result = new APICollection();

        var events = usecase.listEvents();

        result.data = events;
        result.metadata.put("key", "abc");

        // get config
        // logger.info("timeout:" + configBean.javaConfigBean().getTimeout());
        // logger.info("url:" + configBean.getBifrstConfig().getProperty("database.url", "default_url"));

        return ResponseEntity.ok().body(result);
    }

    @PostMapping("")
    public ResponseEntity<Event> createEvent(@RequestBody Event request) {

        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/error")
    public String getLiveList(@RequestParam Long status) {
        status.toString();
        return "my error";
    }


    @GetMapping("/logging")
    public String printLog() {
        log.debug("hello world");
        log.info("hello world");
        log.warn("hello world");
        log.error("hello world");
        return "done";
    }
}
