package io.mike.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author zhaoming
 *
 * 2017年8月16日 上午11:59:48
 */
@Service
public class DemoTask {

	private static final Logger log = LoggerFactory.getLogger(DemoTask.class);
	
	public void anyNameMethod() {
		//System.out.println("111");
		log.debug("!");
	}
	
	
}
