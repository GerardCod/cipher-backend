package com.ibm.aac.gerardo.orquester.controllers;

import org.springframework.http.ResponseEntity;

import com.ibm.aac.gerardo.orquester.dto.CipherInput;
import com.ibm.aac.gerardo.orquester.dto.CipherOutput;
import com.ibm.aac.gerardo.orquester.dto.DecipherInput;
import com.ibm.aac.gerardo.orquester.dto.DecipherOutput;

public interface OrquesterController {
	public ResponseEntity<CipherOutput> cipherMessage(CipherInput input);
	public ResponseEntity<DecipherOutput> decipherMessage(DecipherInput input);
}
