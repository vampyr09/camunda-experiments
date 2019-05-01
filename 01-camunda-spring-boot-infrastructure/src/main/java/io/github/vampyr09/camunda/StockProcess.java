package io.github.vampyr09.camunda;

import java.util.Random;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

public class StockProcess {

	public static final String PROCESS_COUNT_VAR = "count";
	
	public static final String PROCESS_NAME = "Process_stock";

	private int itemCount;

	public StockProcess() {
		super();
		
		this.itemCount = new Random().nextInt(200);
	}

	public StockProcess(int itemCount) {
		this.itemCount = itemCount;
	}

	public void runProcess(final RuntimeService runtimeService) {
		
		runtimeService.startProcessInstanceByKey(PROCESS_NAME, createProcessVariables());
	}

	private VariableMap createProcessVariables() {
		
		VariableMap variables = Variables.createVariables();
		variables.put(PROCESS_COUNT_VAR, this.itemCount);
		
		return variables;
	}
	
}
