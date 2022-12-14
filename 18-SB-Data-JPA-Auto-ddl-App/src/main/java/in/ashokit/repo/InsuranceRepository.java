package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entityBinding.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Serializable> {

}
