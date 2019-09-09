package test.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import test.scin.HelloWorld;
import test.scin.HelloWorld2;
import test.scin.TestHello;
import test.scin.bean.TestBean;

@RestController
@Slf4j
public class TestController {
	
	@Autowired
	private HelloWorld helloWorld;
	@Autowired
	private Test2Controller test2Controller;
	@Autowired
	private HelloWorld2 helloWorld2;
	@Autowired
	private TestHello testHello;
	
	@GetMapping("/test")
	public String test(String t) {
		log.info(helloWorld2.toString());
		
		test2Controller.test2();
		
		helloWorld2.test2("1");
		
		helloWorld2.test3("555");
		
		TestBean bean = new TestBean();
		bean.setId("11");
		helloWorld.test2(bean);
		
		testHello.test2();
		
		return helloWorld.test("123");
	}
}
