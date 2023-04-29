package com.example.hospital.HospController;

import java.util.List;
import java.util.Map;
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
import com.example.hospital.HospRepo.HospRepo;
@RestController
public class HospController {
	@Autowired
	public HospService hser;
	
	//login
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> logindata)
	{
		String username=logindata.get("username");
		String password=logindata.get("password");
		String result=hser.checklogin(username,password);
		return result;
	}

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
	
	//sort by ascending order
	@GetMapping("/sortAsc/{pname}")
	public List<HospModel> sortpatient(@PathVariable("pname") String pname)
	{
		return hser.sortAsc(pname);
	}
	
	//sort by descending order
	@GetMapping("/sortDesc/{pname}")
	public List<HospModel>sortpatients(@PathVariable("pname") String pname)
	{
		return hser.sortDesc(pname);
		
	}
	
	
	//pagination and sorting
	@GetMapping("/paginationsorting/{pgn}/{pgs}/{pname}")
	public List<HospModel> paginationSorting (@PathVariable ("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("pname")String pname)
	
	{
		return hser.paginationAndSorting(pgn,pgs,pname);
	}
	
	//pagination
	@GetMapping("/pagination/{pgn}/{pgs}")
	public List<HospModel>paginationData(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
	{
		return hser.paginationData(pgn,pgs);
	}
	@Autowired
	public HospRepo hsr;
	
	@GetMapping("/Hosp")
	public List<HospModel> getD()
	{
		return hsr.getAllData();
	}
	@GetMapping("/byName/{id}")
	public List<HospModel> getName(@PathVariable("id")int pid)
	{
		return hsr.bypname(pid);
	}
	
	
	 
	

}
