package com.example.hospital.HospService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.hospital.HospModel.HospModel;
import com.example.hospital.HospRepo.HospRepo;
@Service
public class HospService {
	@Autowired
	public HospRepo hrepo;

	public HospModel saveinfo(HospModel hr) {
		// TODO Auto-generated method stub
		return hrepo.save(hr);
	}

	public Optional<HospModel> getdetails(int id) {
		// TODO Auto-generated method stub
		return hrepo.findById(id);
	}

	public HospModel updatedetails(HospModel id) {
		// TODO Auto-generated method stub
		return hrepo.saveAndFlush(id);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		hrepo.deleteById(id);
	}
	

	

}
