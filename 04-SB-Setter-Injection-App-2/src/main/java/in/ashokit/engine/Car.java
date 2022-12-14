package in.ashokit.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ashokit.car.Engine;

@Component
public class Car {

	public Car() {

		System.out.println("++++++++++++++++++++++ Car constructor +++++++++++++++++++++++++");

	}

	//@Autowired
	private Engine eng;
	
	@Autowired													//Setter Injection
	public void SetEng(Engine eng) {
		System.out.println("Setter Injection for Engine in Car class");
		this.eng=eng;
	}

	public void drive() {
		int st = eng.start();
		System.out.println("The engine status::"+st);
		if (st >= 0) {
			System.out.println("journey start");
		} else {
			System.out.println("journey not started");
		}

	}

}
