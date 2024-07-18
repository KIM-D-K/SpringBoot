package com.korea.di.qualifire;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.korea.di.dependency.Computer;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class QualifierTest {

	@Autowired
	Computer computer;
	
	@Test
	public void computerTest() {
		log.info(computer.getScreenWidth()+"");
	}
}
