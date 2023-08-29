package io.sunculture.EventhubToDynamo.controller;

import io.sunculture.EventhubToDynamo.models.Metric;
import io.sunculture.EventhubToDynamo.service.MetricService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MetricController {

    private final MetricService metricService;

    @PostMapping(path = "/process-event", produces = "application/json")
    public ResponseEntity<String> processEvent(@RequestBody List<Metric> event) {
        return new ResponseEntity<>(metricService.processEvent(event), HttpStatus.OK);
    }

    @PostMapping(path = "/error", produces = "application/json")
    public String someMsg() {
        return "Default error msg";
    }



}
