package com.sprphnx.task.impl;

import com.sprphnx.task.Task;

public class AccessoriesChangeTask implements Task {

	@Override
	public void doCommit() {
		System.out.println("Commiting accessories");
		
	}

	@Override
	public void handleException() {
		System.out.println("Error Commiting accessories");
	}

}
