package io.mike.task;

/* junit 4.11+ 以后都不再支持 junit.framework.Assert */
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author zhaoming
 *
 * 2017年8月16日 下午12:06:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:app-ctx-all.xml"})
public class DemoTaskTester {
	
	private static final Logger log = LoggerFactory.getLogger(DemoTaskTester.class);
	
	@Autowired
	private DemoTask demoTask;
	
	@Test
	public void test_inject() throws InterruptedException {
		assertNotNull(demoTask);
	}
	
	@Test
	@Timed(millis=22000)
	public void test_for_task() throws InterruptedException {
		log.debug("wait for task test.");
		TimeUnit.SECONDS.sleep(20);
	}
	
	
}
