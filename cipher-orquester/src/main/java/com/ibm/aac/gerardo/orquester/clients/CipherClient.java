package com.ibm.aac.gerardo.orquester.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.aac.gerardo.orquester.dto.CipherInput;
import com.ibm.aac.gerardo.orquester.dto.CipherOutput;

@FeignClient(name = "CipherService", url = "http://localhost:8081")
@RequestMapping("/cipher/api/v1")
public interface CipherClient {
	
	@PostMapping("/")
	public ResponseEntity<CipherOutput> cipherMessage(@RequestBody CipherInput input);
	
}
