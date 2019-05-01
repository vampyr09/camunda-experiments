package io.github.vampyr09.camunda;

import org.assertj.core.api.Assertions;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StockProcessTest {

	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	private TaskService taskService;
	
	@Test
	public void testUserTaskCreation() {
		
		final int count = 5;
		new StockProcess(count).runProcess(this.runtimeService);
		
		Assertions.assertThat(this.taskService.createTaskQuery().count()).isEqualTo(1);
	}
	
}
