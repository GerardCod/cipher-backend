package com.ibm.aac.gerardo.orquester.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DecipherOutput implements Serializable {
	private static final long serialVersionUID = 2L;
	private String decipherMessage;
}
