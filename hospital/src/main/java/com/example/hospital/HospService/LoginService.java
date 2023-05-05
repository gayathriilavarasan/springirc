package com.example.hospital.HospService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.HospModel.LoginModel;
import com.example.hospital.HospRepo.LoginRepo;
@Service
public class LoginService {
	@Autowired
	private LoginRepo repol;

	public String checkLogin(String name, String pwd) {
		LoginModel user=repol.findByname(name);
		if(user==null)
		{
			
			return "No User Found";
		}
		else
		{
			if(user.getPwd().equals(pwd))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public LoginModel adduser(LoginModel hospital)
	{
		return repol.save(hospital);
	}
	public List<LoginModel>getuser()
	{
		return repol.findAll();
	}

	public LoginModel adddetails(LoginModel id) {
		
		return repol.save(id);
	}

}
