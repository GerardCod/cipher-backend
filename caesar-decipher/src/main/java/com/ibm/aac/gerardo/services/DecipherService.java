package com.ibm.aac.gerardo.services;

public interface DecipherService {
	String decipher(String message, Integer shift);
	boolean isUpper(char symbol);
	boolean isLower(char symbol);
	int decipherChar(char currentChar, int shift, int finalAscii);
}
