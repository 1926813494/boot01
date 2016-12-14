package application.tasks;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

//@Configuration
//@EnableScheduling
public class MyTask {

	//@Scheduled(cron="0 0/1 * * * ?")
	public void hearbeat() {
		System.out.println("MyTask.hearbeat...................");
	}
	
}
