package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Printer {

	public Printer() {
		System.out.println("++++++++++++++++++ Printer Constructor ++++++++++++++++++");
	}
	public void printPS() {
		System.out.println("++++++++++++++++++ Payslip generate ++++++++++++++++++");
	}
}
