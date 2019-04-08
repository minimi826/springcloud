package com.hmg.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Humenggu
 * @date 2019/04/08 星期一 14:22
 */
@FeignClient(value = "eureka-client-1", fallback = HelloServiceHiHystric.class)
public interface HelloClient {
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
