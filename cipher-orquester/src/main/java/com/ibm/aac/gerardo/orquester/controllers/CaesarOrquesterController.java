package com.ibm.aac.gerardo.orquester.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.aac.gerardo.orquester.clients.CipherClient;
import com.ibm.aac.gerardo.orquester.clients.DecipherClient;
import com.ibm.aac.gerardo.orquester.dto.CipherInput;
import com.ibm.aac.gerardo.orquester.dto.CipherOutput;
import com.ibm.aac.gerardo.orquester.dto.DecipherInput;
import com.ibm.aac.gerardo.orquester.dto.DecipherOutput;

@RestController
@RequestMapping("/orquester")
public class CaesarOrquesterController implements OrquesterController {
	
	@Autowired
	private CipherClient cipherService;
	
	@Autowired
	private DecipherClient decipherService;
	
	@Override
	@PostMapping("/cipher")
	public ResponseEntity<CipherOutput> cipherMessage(@RequestBody CipherInput input) {
		return this.cipherService.cipherMessage(input);	}

	@Override
	@PostMapping("/decipher")
	public ResponseEntity<DecipherOutput> decipherMessage(@RequestBody DecipherInput input) {
		return this.decipherService.decipherMessage(input);
	}

}
