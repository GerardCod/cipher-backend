package com.ibm.aac.gerardo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.aac.gerardo.dto.Input;
import com.ibm.aac.gerardo.dto.Output;
import com.ibm.aac.gerardo.services.DecipherService;

@RestController
@RequestMapping("/decipher/api/v1")
public class CaesarDecipherController implements DecipherController {
	
	@Autowired
	private DecipherService service;
	
	@Override
	@PostMapping("/")
	public ResponseEntity<Output> decipherMessage(@RequestBody Input input) {
		// TODO Auto-generated method stub
		String decipherMessage = this.service.decipher(input.getCipherMessage(), input.getShift());
		Output output = new Output(decipherMessage);
		return ResponseEntity.ok(output);
	}

}
