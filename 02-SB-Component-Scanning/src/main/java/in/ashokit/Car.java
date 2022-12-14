package in.ashokit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Car {
	public Car() {
		System.out.println("+++++++++++++++ Car Class object Got Created +++++++++++++++");
	}
}
