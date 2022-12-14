package in.ashokit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Motor {

	public Motor() {
		System.out.println("Motor Constructor");
	}

	@PostConstruct
	public void start2() {
		System.out.println("Second Motor started");
	}
	@PostConstruct
	public void start() {
		System.out.println("Motor started");
	}
	
	public void doWork() {
		System.out.println("+++++++++++Motor working+++++++++++");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Motor stopped");
	}
}
