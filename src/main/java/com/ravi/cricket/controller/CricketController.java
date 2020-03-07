package com.ravi.cricket.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.cricket.service.CricketService;


@RestController
@RequestMapping("/score")
public class CricketController {

	@Autowired
	private CricketService cricketService;
    
	
	@GetMapping("/match/{matchId}")
	public String getScore(@PathParam("matchId") String matchId) {
		
		return cricketService.getMatchData(matchId);
	}

}
