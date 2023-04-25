package com.example.hospital.HospController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.HospService.HospService;
import com.example.hospital.HospModel.HospModel;
@RestController
public class HospController {
	@Autowired
	public HospService hser;

	//post
	@PostMapping("/savedetails")
	public HospModel addDetails(@RequestBody HospModel hr)
	{
		return hser.saveinfo(hr);
	}
	
	//Get
	@GetMapping("/savedetails/{id}")
	public Optional<HospModel> getdetails(@PathVariable("id")int id)
	{
		return hser.getdetails(id);
	}
	
	//update
	@PutMapping("/update")
	public HospModel updatedetails(@RequestBody HospModel id)
	{
		return hser.updatedetails(id);
	}
	
	//Delete
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable ("id")int id)
	{
		hser.deletedetails(id);
		return "Deletion is successful";
	}

}
