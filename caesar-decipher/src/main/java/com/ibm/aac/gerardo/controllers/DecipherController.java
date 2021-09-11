package com.ibm.aac.gerardo.controllers;

import org.springframework.http.ResponseEntity;

import com.ibm.aac.gerardo.dto.Input;
import com.ibm.aac.gerardo.dto.Output;

public interface DecipherController {
	ResponseEntity<Output> decipherMessage(Input input);
}
