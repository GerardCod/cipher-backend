package com.ibm.aac.gerardo.services;

import org.springframework.stereotype.Service;

@Service
public class CeasarCipherServiceImpl implements CaesarCipherService {

	@Override
	public String cipherText(String text, Integer shift) {
		char[] cipherText = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i);
			
			if (isUpper(currentChar)) {
				cipherText[i] = (char) cipherChar(currentChar, shift, 65);
			} else if (isLower(currentChar)) {
				cipherText[i] = (char) cipherChar(currentChar, shift, 97);
			} else {
				cipherText[i] = (char) cipherChar(currentChar, shift, (int) currentChar);
			}
		}
		
		return String.valueOf(cipherText);
	}

	@Override
	public boolean isUpper(char symbol) {
		return (symbol >= 65 && symbol <= 90);
	}

	@Override
	public int cipherChar(char currentChar, int shift, int initialAsciiValue) {
		return (currentChar + shift - initialAsciiValue) % 26 + initialAsciiValue;
	}

	@Override
	public boolean isLower(char symbol) {
		return (symbol >= 97 && symbol <= 122);
	}
	
}
