package io.github.vampyr09.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RecommendItemDelegate implements JavaDelegate {

	private static final Logger LOGGER = LoggerFactory.getLogger(RecommendItemDelegate.class);
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {

		LOGGER.info("Recommended item for next advertisment.");
	}

}
