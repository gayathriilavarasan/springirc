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

import io.swagger.v3.oas.annotations.tags.Tag;

import com.example.hospital.HospModel.HospModel;
import com.example.hospital.HospRepo.HospRepo;
@RestController
public class HospController {
	@Autowired
	public HospService hser;
	
	

	//post
	@Tag(name = "Posting",description = "Posting the given details")
	@PostMapping("/savedetails")
	public HospModel addDetails(@RequestBody HospModel hr)
	{
		return hser.saveinfo(hr);
	}
	
	//Get
	@Tag(name = "Get Details",description = "To get the required detail")
	@GetMapping("/savedetails/{id}")
	public Optional<HospModel> getdetails(@PathVariable("id")int id)
	{
		return hser.getdetails(id);
	}
	
	//update
	@Tag(name = "Updating",description = "Update the given details")
	@PutMapping("/update")
	public HospModel updatedetails(@RequestBody HospModel id)
	{
		return hser.updatedetails(id);
	}
	
	//Delete
	@Tag(name = "Deleting",description = "Deleting the given details")
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable ("id")int id)
	{
		hser.deletedetails(id);
		return "Deletion is successful";
	}
	
	//sort by ascending order
	@Tag(name = "Sort Asc",description = "Sorting the given details in ascending order")
	@GetMapping("/sortAsc/{pname}")
	public List<HospModel> sortpatient(@PathVariable("pname") String pname)
	{
		return hser.sortAsc(pname);
	}
	
	//sort by descending order
	@Tag(name = "Sort Desc",description = "Sorting the given details in descending order")
	@GetMapping("/sortDesc/{pname}")
	public List<HospModel>sortpatients(@PathVariable("pname") String pname)
	{
		return hser.sortDesc(pname);
		
	}
	
	
	//pagination and sorting
	@Tag(name = "Pagination and Sorting",description = "Pagination and Sorting the given details ")
	@GetMapping("/paginationsorting/{pgn}/{pgs}/{pname}")
	public List<HospModel> paginationSorting (@PathVariable ("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("pname")String pname)
	
	{
		return hser.paginationAndSorting(pgn,pgs,pname);
	}
	
	//pagination
	@Tag(name = "Pagination ",description = "pagination")
	@GetMapping("/pagination/{pgn}/{pgs}")
	public List<HospModel>paginationData(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
	{
		return hser.paginationData(pgn,pgs);
	}
	@Autowired
	public HospRepo hsr;
	
	@Tag(name = "Get details",description = "To get all Details using native query")
	@GetMapping("/Hosp")
	public List<HospModel> getD()
	{
		return hsr.getAllData();
	}
	
	@Tag(name = "Get details ",description = "To get a particular detail using native query")
	@GetMapping("/byName/{id}")
	public List<HospModel> getName(@PathVariable("id")int pid)
	{
		return hsr.bypname(pid);
	}
	
	@Tag(name = "Getting Data",description = "To get details using start end method using native query")
	@GetMapping("/startend/{start}/{end}")
	public List<HospModel> statendId(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return hsr.startEnd(start,end);
	}
	
	@Tag(name = "Delete details ",description = "To delete the details using native query")
	@DeleteMapping("/deletebyid/{id}/{name}")
	public String deletePerson(@PathVariable("id")int id,@PathVariable("name") String name)
	{
		hsr.deleteId(id,name);
		return "deleted";
	}
	
	@Tag(name = "Updating",description = "To update the given details using native query")
	@PutMapping("/updatequery/{id}/{name}")
	public void updateByQuery(@PathVariable("id")int id,@PathVariable("name")String name)
	{
		hsr.updateByQuery(id,name);
	}
	
	
	//JPQL:
	
	@Tag(name = "Get Details ",description = "To get the details using jpql query")
	@GetMapping("/jpqlget/{name}")
	public List<HospModel>getdetailname(@PathVariable("name")String name)
	{
		return hsr.getjpqlname(name);
	}
	
	@Tag(name = "Start and End",description = "To get details using jpql query")
	@GetMapping("/getbtw/{start}/{end}")
	public List<HospModel>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return hsr.getbtw(start,end);
	}
	
	@Tag(name = "Delete details",description = "To delete details using jpql query")
	@DeleteMapping("/deletejpql/{id}")
	public String deletejpqlid(@PathVariable("id")int id)
	{
		hsr.deletejpqlid(id);
		return "Deleted Successfully using jpql query !"; 
	}
	
	@Tag(name = "Update details",description = "To update details using jpql query")
	@PutMapping("/updatejpql/{a}/{b}")
	public void updatejpql(@PathVariable("a")String a,@PathVariable("b")int b)
	{
		hsr.updatejpql(a,b);
	}
	
	 
	

}
