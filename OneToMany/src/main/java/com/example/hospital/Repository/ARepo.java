package com.example.hospital.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hospital.Model.AModel;

public interface ARepo extends JpaRepository<AModel,Integer> {

}
