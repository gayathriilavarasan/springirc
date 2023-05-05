package com.example.hospital.HospController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.HospModel.LoginModel;
import com.example.hospital.HospService.LoginService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class LoginController {
	@Autowired
	private LoginService service;
	@Tag(name = "Login",description = "To login")
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> logindata)
	{
		String name=logindata.get("name");
		String pwd=logindata.get("pwd");
		String result=service.checkLogin(name,pwd);
		return result;
	}
	
	//posting the details
	@Tag(name = "Posting ",description = "To post the details")
	@PostMapping("/post")
	public LoginModel adddetails(@RequestBody LoginModel id)
	{
		return service.adddetails(id);
	}
	

}
