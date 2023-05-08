package com.example.loan.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.loan.Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel,Integer>{

}
