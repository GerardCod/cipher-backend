package com.ibm.aac.gerardo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.aac.gerardo.dto.Input;
import com.ibm.aac.gerardo.dto.Output;
import com.ibm.aac.gerardo.services.CaesarCipherService;

@RestController
@RequestMapping("/cipher/api/v1")
public class CaesarCipherControllerImpl implements CaesarCipherController {
	private CaesarCipherService service;
	
	@Autowired
	public CaesarCipherControllerImpl(CaesarCipherService service) {
		this.service = service;
	}
	
	@PostMapping("/")
	@Override
	public ResponseEntity<Output> cipherText(@RequestBody Input input) {
		String cipherText = this.service.cipherText(input.getMessage(), input.getShiftKey());
		Output output = new Output(cipherText);
		return ResponseEntity.ok(output);
	}
	
	@GetMapping("/greet/{name}")
	@Override
	public ResponseEntity<String> greet(@PathVariable String name) {
		return ResponseEntity.ok("Hola " + name);	
	}

}
