package com.springboot.scheduler.SpringBootSchedular;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskSchedulerTest {

//	@Scheduled(fixedRate=5000, initialDelay=5000)
//	@Scheduled(fixedDelay=10000)
	@Scheduled(cron = "*/10 * * * * *") // every ten seconds
	public void taskScheduling() {
		System.out.println("Task Scheduling..." + new Date());
	}
}
