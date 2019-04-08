package com.hmg.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Humenggu
 * @date 2019/04/08 星期一 14:23
 */
@RestController
public class HiController {
	@Autowired
	private HelloClient helloClient;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		return helloClient.sayHiFromClientOne(name);
	}
}
