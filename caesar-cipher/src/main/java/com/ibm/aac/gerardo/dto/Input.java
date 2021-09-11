package com.ibm.aac.gerardo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Input {
	private String message;
	private Integer shiftKey;
}
