package in.ashokit.DAO;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {

	public EmpDAO() {
		System.out.println("---------------------------Emp DAO @Repository Constructor-----------------------------");
	}
	
	
	public void EmpDaoMeh() {
		System.out.println("================EmpDAO class method=========================");
	}

}
