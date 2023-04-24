package com.example.day3.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.day3.model.CarModel;
public interface CarRepo extends JpaRepository<CarModel ,Integer> {

}
