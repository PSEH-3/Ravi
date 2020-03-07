package com.ravi.test.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class CricketController {

	@GetMapping
	public String test() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url
		  = "https://cricapi.com/api/matches";
		String requestJson = "Request:\r\n{\r\n  \"apikey\": \"WmPJrX2s3KMyZVPFwlm1vxXLXKw1\"\r\n}";
		String response = restTemplate.postForObject(url, requestJson, String.class);
		System.out.println("response is "+ response);
		return "hey ravi!!";
	}
	
}
