package com.sprphnx.task.impl;

import com.sprphnx.task.Task;

public class EngineChangeTask implements Task {

	@Override
	public void doCommit() {
		System.out.println("Commiting engine");
		
	}

	@Override
	public void handleException() {
		System.out.println("Error Commiting engine");
	}

}
