package com.sprphnx.task.impl;

import com.sprphnx.task.Task;

public class BodyChangeTask implements Task{

	@Override
	public void doCommit() {
		System.out.println("Commiting body");
		throw new RuntimeException();		
	}

	@Override
	public void handleException() {
		System.out.println("Error Commiting body");
	}
	
}
