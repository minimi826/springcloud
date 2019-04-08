package com.hmg.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Humenggu
 * @date 2019/04/08 星期一 13:54
 */
@Service
public class HelloService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		return restTemplate.getForObject("http://eureka-client-1/hi?name="+name,String.class);
	}

	public String hiError(String name) {
		return "hi,"+name+",sorry,error!";
	}
}
