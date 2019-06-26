package test.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import test.scin.HelloWorld;
import test.scin.HelloWorld2;

@RestController
@Slf4j
public class TestController {
	
	@Autowired
	private HelloWorld helloWorld;
	@Autowired
	private Test2Controller test2Controller;
	@Autowired
	private HelloWorld2 helloWorld2;
	
	@GetMapping("/test")
	public String test(String t) {
		log.info(helloWorld.toString());
		
		test2Controller.test2();
		
		helloWorld2.test2("1");
		
		return helloWorld.test("123");
	}
}
