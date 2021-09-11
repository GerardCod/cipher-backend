package com.ibm.aac.gerardo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Input {
	private String cipherMessage;
	private Integer shift;
}
