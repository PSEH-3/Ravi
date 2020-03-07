package com.ravi.cricket.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CricketService {

	public String getMatchData(String matchId) {
		
		HttpHeaders headers = setAndGetHeaders();
		
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://cricapi.com/api/cricketScore";

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		return response.getBody();
	}

	private HttpHeaders setAndGetHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("apiKey", "WmPJrX2s3KMyZVPFwlm1vxXLXKw1");
		headers.add("Match-UniqueID", "1136617");
		return headers;
	}
	
	
}
