package com.ibm.aac.gerardo.orquester.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class DecipherInput {
	private String cipherMessage;
	private Integer shift;
}
