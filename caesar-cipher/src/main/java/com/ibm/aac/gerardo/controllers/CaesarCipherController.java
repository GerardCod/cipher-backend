package com.ibm.aac.gerardo.controllers;

import org.springframework.http.ResponseEntity;

import com.ibm.aac.gerardo.dto.Input;
import com.ibm.aac.gerardo.dto.Output;

public interface CaesarCipherController {
	ResponseEntity<Output> cipherText(Input input);
	ResponseEntity<String> greet(String name);
}
