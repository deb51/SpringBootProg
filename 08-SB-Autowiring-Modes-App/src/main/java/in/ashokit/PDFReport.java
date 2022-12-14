package in.ashokit;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdf")
@Primary
public class PDFReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("===========PDF Report Generated============");
		
	}

}
