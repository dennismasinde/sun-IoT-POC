package io.sunculture.EventhubToDynamo.repository;

import io.sunculture.EventhubToDynamo.models.Metric;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface MetricRepository extends PagingAndSortingRepository<Metric, String> {
}
