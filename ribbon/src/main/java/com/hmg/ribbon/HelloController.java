package com.hmg.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Humenggu
 * @date 2019/04/08 星期一 14:05
 */
@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService( name );
	}
}
