package org.mycompany.repository;

import org.mycompany.models.RequestLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestLogRepository extends JpaRepository<RequestLog, Integer> {

}
