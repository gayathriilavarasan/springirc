package com.example.hospital.HospRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hospital.HospModel.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,Integer> {
	LoginModel findByname(String name);

}
