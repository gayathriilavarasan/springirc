package com.example.hospital.HospRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.HospModel.HospModel;

@Repository
public interface HospRepo extends JpaRepository<HospModel,Integer>{

}
