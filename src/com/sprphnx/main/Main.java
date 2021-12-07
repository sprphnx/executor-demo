package com.sprphnx.main;

import java.util.Arrays;
import java.util.List;

import com.sprphnx.task.Task;
import com.sprphnx.task.impl.AccessoriesChangeTask;
import com.sprphnx.task.impl.BodyChangeTask;
import com.sprphnx.task.impl.EngineChangeTask;
import com.sprphnx.task.runner.TaskRunner;

public class Main {
	
	public static void main(String[] args) {
		List<Task> parallelTasks = Arrays.asList(new BodyChangeTask(),new EngineChangeTask(),new AccessoriesChangeTask());
		List<Task> sequentialTasks = Arrays.asList(new BodyChangeTask(),new EngineChangeTask(),new AccessoriesChangeTask());

		sequentialRun(sequentialTasks);
		System.out.println("\n*******************\n**************\n");
		parallelRun(parallelTasks);

	}

	private static void sequentialRun(List<Task> sequentialTasks) {
		sequentialTasks.forEach(task->new TaskRunner(task).run());
	}

	private static void parallelRun(List<Task> tasks) {
		tasks.forEach(task -> new Thread(new TaskRunner(task)).start());
	}

}
