package com.infybuzz.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class FirstJobListener implements JobExecutionListener{

	@Override
	public void beforeJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		System.out.println("Before Job " + jobExecution.getJobInstance().getJobName());
		System.out.println("Job Params " + jobExecution.getJobParameters());
		System.out.println("Job exec context " + jobExecution.getExecutionContext());
		jobExecution.getExecutionContext().put("jec", "testes");
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("after Job " + jobExecution.getJobInstance().getJobName());
		System.out.println("Job Params " + jobExecution.getJobParameters());
		System.out.println("Job exec context " + jobExecution.getExecutionContext());
		
	}

}
