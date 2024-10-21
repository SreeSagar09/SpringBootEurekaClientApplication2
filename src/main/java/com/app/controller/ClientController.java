package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientController")
public class ClientController {
	
	@GetMapping(path = "/clientHandler")
	public ResponseEntity<Map<String, Object>> clientHandler(){
		
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("message", "Action from clientHandler method in ClientController");
			data.put("application", "SpringBootEurekaClientApplication2");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
}
