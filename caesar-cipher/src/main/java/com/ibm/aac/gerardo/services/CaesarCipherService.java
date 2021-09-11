package com.ibm.aac.gerardo.services;

public interface CaesarCipherService {
	String cipherText(String text, Integer shift);
	boolean isUpper(char symbol);
	boolean isLower(char symbol);
	int cipherChar(char currentChar, int shift, int initialAsciiValue);
}
