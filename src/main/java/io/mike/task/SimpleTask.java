package io.mike.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午5:17:41
 */
@Service
public class SimpleTask {

	private static final Logger log = LoggerFactory.getLogger(SimpleTask.class);
	
	public void execute() {
		log.debug("simple task...");
	}
	
	
}
