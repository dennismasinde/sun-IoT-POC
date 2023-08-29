package io.sunculture.EventhubToDynamo.service;

import io.sunculture.EventhubToDynamo.models.Metric;
import io.sunculture.EventhubToDynamo.repository.MetricRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetricService {

    private final MetricRepository metricRepository;

    public String processEvent (List<Metric> event) {
        return "";
    }
}
