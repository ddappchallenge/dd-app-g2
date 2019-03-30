package com.ddth.challenge.shtp.controller;

import com.ddth.challenge.shtp.algorithm.ShortestPath;
import com.ddth.challenge.shtp.model.AllShortestPathResponse;

import com.ddth.challenge.shtp.model.Edge;
import com.ddth.challenge.shtp.model.Graph;

import com.ddth.challenge.shtp.model.ResponseMessage;

import com.ddth.challenge.shtp.model.ShortestPathResponse;
import com.ddth.challenge.shtp.algorithm.Node;

import com.ddth.challenge.shtp.model.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class SHTPController {

	private static String lastestMessage = "Hello world hehe";

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/hello")
	public ResponseMessage helloGet(){
		ResponseMessage hm = new ResponseMessage();
		hm.setMessage(lastestMessage);
		hm.setStatus("OK");
		hm.setDate("30/3/2019");
		return hm;
	}

	@PostMapping(value="/set-hello-message")
	public HttpStatus setResponseMessage(@RequestParam(value="message") String message){
		lastestMessage = message;
		return HttpStatus.OK;
	}

	@GetMapping(value = "short")
	public String ShortestPath(){
		ShortestPath a= new ShortestPath();
		return "Just a sample";
	}
	
	@PostMapping(value="/graph")
	@ResponseStatus(HttpStatus.OK)
	public void createGraph(@RequestBody Graph req) throws Exception{	
		
	}
	
	@GetMapping(value="/graph/shortestPath")
	public ShortestPathResponse getShortestPath(@RequestParam(value="src") String src, @RequestParam(value="dest") String dest) throws Exception{
		return null;
	}
	@GetMapping(value="/graph/allShortestPath")
	public AllShortestPathResponse getAllShortestPath(@RequestParam(value="src") String src, @RequestParam(value="dest") String dest) throws Exception{
		return null;
	}
	
	
	
	
}
