package com.sprphnx.task.runner;

import com.sprphnx.task.Task;

public class TaskRunner implements Runnable{
	
	Task task;
	
	public TaskRunner(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		try {
			task.doCommit();
		} catch (Exception e) {
			task.handleException();
		}
	}

}
