package org.mycompany.repository;

import org.mycompany.models.RequestLog;
import org.springframework.beans.factory.annotation.Autowired;

public class ReuestForwartToRepository {
	
	@Autowired
	RequestLogRepository requestLogRepository;

	public int processDef(RequestLog rl)
	{
		requestLogRepository.save(rl);
		return rl.getId();
	}
	
	
}
