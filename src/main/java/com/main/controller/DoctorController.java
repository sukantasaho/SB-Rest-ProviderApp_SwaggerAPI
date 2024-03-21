package com.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DoctorController
{
    
	   @GetMapping("/getDoctor")
	   public ResponseEntity<Doctor> getDoctor()
	   {
		   Doctor d = new Doctor();
		   d.setId(101);d.setDocName("Sukanta");d.setSalary(5000d);
		   
		   return new ResponseEntity<Doctor>(d, HttpStatus.OK);
	   }
	   
}
