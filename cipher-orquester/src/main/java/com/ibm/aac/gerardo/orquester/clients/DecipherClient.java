package com.ibm.aac.gerardo.orquester.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.aac.gerardo.orquester.dto.DecipherInput;
import com.ibm.aac.gerardo.orquester.dto.DecipherOutput;

@FeignClient(name = "DecipherClient", url = "http://localhost:8085")
@RequestMapping("/decipher/api/v1")
public interface DecipherClient {
	
	@PostMapping("/")
	public ResponseEntity<DecipherOutput> decipherMessage(@RequestBody DecipherInput input);
	
}
