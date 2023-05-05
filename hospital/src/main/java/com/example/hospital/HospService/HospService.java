package com.example.hospital.HospService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

	public List<HospModel> sortAsc(String pname) {
		// TODO Auto-generated method stub
		return hrepo.findAll(Sort.by(pname).ascending());
	}

	public List<HospModel> paginationAndSorting(int pgn, int pgs,String pname) {
		// TODO Auto-generated method stub
		Page<HospModel>p=hrepo.findAll(PageRequest.of(pgn,pgs,Sort.by(pname).descending()));
				return p.getContent();
	}

	public List<HospModel> sortDesc(String pname) {
		// TODO Auto-generated method stub
		return hrepo.findAll(Sort.by(pname).descending());
	}

	public List<HospModel> paginationData(int pgn, int pgs) {
		// TODO Auto-generated method stub
		Page<HospModel>p=hrepo.findAll(PageRequest.of(pgn,pgs));
		return p.getContent() ;
	}

	
	
}
	

	


