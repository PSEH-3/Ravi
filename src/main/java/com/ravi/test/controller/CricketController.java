package com.ravi.test.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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
		headers.add("apiKey", "WmPJrX2s3KMyZVPFwlm1vxXLXKw1");
		headers.add("Match-UniqueID","1136617");
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		RestTemplate restTemplate = new RestTemplate();
		String url
		  = "http://cricapi.com/api/cricketScore";
		
		ResponseEntity<String >response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		System.out.println("response is "+ response.getBody());
		return "hey ravi!!";
	}
	
}
