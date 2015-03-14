package com.uaijug.afd.esfinge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uaijug.afd.esfinge.service.HomeService;

@RestController
@RequestMapping("/app")
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> home() {
		return new ResponseEntity<String>(this.homeService.helloWorld(), HttpStatus.OK);
	}

}
