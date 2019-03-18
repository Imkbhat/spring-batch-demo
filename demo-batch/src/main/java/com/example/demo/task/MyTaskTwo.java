package com.example.demo.task;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyTaskTwo implements Tasklet{

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) 
			throws Exception {

		System.out.println("MyTaskTwo is Started.....");
		
		System.out.println("Some Part of the coode MyTaskTwo iis Executed");
		
		System.out.println("MyTaskTwo done..");
		
		return RepeatStatus.FINISHED;
	}
	
	

}
