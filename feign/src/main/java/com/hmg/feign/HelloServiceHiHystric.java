package com.hmg.feign;

import org.springframework.stereotype.Component;

/**
 * @author Humenggu
 * @date 2019/04/08 星期一 15:04
 */
@Component
public class HelloServiceHiHystric implements HelloClient {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}
