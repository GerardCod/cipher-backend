package com.ibm.aac.gerardo.services;

import org.springframework.stereotype.Service;

@Service
public class CaesarDecipherService implements DecipherService {

	@Override
	public String decipher(String cipherMessage, Integer shift) {
		char[] decipherMessage = new char[cipherMessage.length()];
		
		for (int i = 0; i < cipherMessage.length(); i++) {
			char currentChar = cipherMessage.charAt(i);
			if (isUpper(currentChar)) {
				decipherMessage[i] = (char) decipherChar(currentChar, shift, 90);
			} else if (isLower(currentChar)) {
				decipherMessage[i] = (char) decipherChar(currentChar, shift, 122);
			} else {
				decipherMessage[i] = (char) decipherChar(currentChar, shift, (currentChar - shift));
			}
		}
		
		return String.valueOf(decipherMessage);
	}

	@Override
	public boolean isUpper(char symbol) {
		return (symbol >= 65 && symbol <= 90);
	}


	@Override
	public int decipherChar(char currentChar, int shift, int finalAscii) {
		return (currentChar - shift - finalAscii) % 26 + finalAscii;
	}

	@Override
	public boolean isLower(char symbol) {
		return (symbol >= 97 && symbol <= 122);
	}
	
}
