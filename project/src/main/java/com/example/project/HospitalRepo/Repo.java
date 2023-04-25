package com.example.project.HospitalRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.HospitalModel.Model;
public interface Repo extends JpaRepository<Model,Integer> {

}
