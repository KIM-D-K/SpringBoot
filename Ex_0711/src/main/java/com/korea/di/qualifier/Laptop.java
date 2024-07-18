package com.korea.di.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("laptop")
public class Laptop implements Computer{

	@Overrride
	public int getScreenWidth() {
		return 1920;
	}
}
