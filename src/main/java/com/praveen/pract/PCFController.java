package com.praveen.pract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PCFController {
	
	@GetMapping("/")
	public String getMsg() {		
		
		return "PCF and JenKin";
	}

}
