package com.example.hospital.HospRepo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hospital.HospModel.HospModel;

@Repository
public interface HospRepo extends JpaRepository<HospModel,Integer>{
	HospModel findByUsername(String username);
	
	@Query(value="Select * from entry",nativeQuery=true)
	public List<HospModel> getAllData();
	
	@Query(value="Select * from entry where pid=:id",nativeQuery=true)
	public List<HospModel>bypname(@Param("id")int pid);
	
	
	

}
