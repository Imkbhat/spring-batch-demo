package com.example.demo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBatchApplication implements CommandLineRunner {
	
	@Autowired
	JobLauncher launcher ;

	@Autowired
	Job job;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoBatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JobParameters params = new JobParametersBuilder()
								.addString("JobId", String.valueOf(System.currentTimeMillis()))
								.toJobParameters();
		launcher.run(job, params);
	}

}
