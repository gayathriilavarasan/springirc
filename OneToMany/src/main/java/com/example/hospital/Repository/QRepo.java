package com.example.hospital.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hospital.Model.QModel;

public interface QRepo extends JpaRepository<QModel,Integer>{

	@Query(value="select * from QModel",nativeQuery=true)
	public List<QModel>getalldata();

	
}
