package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entityBinding.Insurance;
import in.ashokit.repo.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepository insuranceRepo;
	
	public void savePlan() {
		Insurance inc=new Insurance();
		inc.setInsuranceCompany("Birla");
		inc.setInsuranceId(105);
		inc.setInsuranceAmount("20000");
		insuranceRepo.save(inc);
		
	}
}
