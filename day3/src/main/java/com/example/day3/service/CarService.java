package com.example.day3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day3.model.CarModel;
import com.example.day3.repository.CarRepo;

@Service
public class CarService {
	@Autowired
	public CarRepo crepo;
	public CarModel saveinfo(CarModel c)
	{
		return crepo.save(c);
	}

}
