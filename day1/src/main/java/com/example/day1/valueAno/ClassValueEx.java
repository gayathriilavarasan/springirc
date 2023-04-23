package com.example.day1.valueAno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassValueEx {
	@Value("${carname:'skoda'}")
	public String car;
	@GetMapping("/mycar")
	@ResponseBody
	public String car()
	{
		return "My fav car "+car;
	}

}
