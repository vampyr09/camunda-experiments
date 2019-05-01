package io.github.vampyr09.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CountItemDelegate implements JavaDelegate {

	private static final Logger LOGGER = LoggerFactory.getLogger(CountItemDelegate.class);
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		LOGGER.info("The stock for the item is {}.", execution.getVariable(StockProcess.PROCESS_COUNT_VAR));
	}

}
