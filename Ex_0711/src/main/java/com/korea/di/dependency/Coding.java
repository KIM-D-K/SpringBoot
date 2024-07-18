package com.korea.di.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Component
@Data
@RequiredArgsConstructor
public class Coding {
	
//	@Autowired
//	private Computer computer;
	
	final Computer computer;
}
