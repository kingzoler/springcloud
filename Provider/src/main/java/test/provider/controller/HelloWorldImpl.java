package test.provider.controller;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;

import lombok.extern.slf4j.Slf4j;
import test.provider.mapper.TestMapper;
import test.scin.HelloWorld;
import test.scin.TestHello;
import test.scin.bean.TestBean;

@RestController
@Service
@Transactional
@Slf4j
public class HelloWorldImpl implements HelloWorld {

	@Autowired
	private TestHello testHello;

	@Autowired
	private TestMapper testMapper;

	@LcnTransaction
	public String test(String id) {
		// throw new TestException("123");
		log.info("test");

		testMapper.insertTest(RandomStringUtils.randomAlphabetic(10));

		System.out.println(testHello.test("456"));

		// System.out.println(1/0);

		testMapper.insertTest(RandomStringUtils.randomAlphabetic(10));

		return "hello" + id.toString();
	}

	@Override
	public String test2(TestBean bean) {
		System.out.println("post:" + bean.getId());
		return null;
	}

	@Override
	public String test3(TestBean bean) {
		System.out.println("put:" + bean.getId());
		return null;
	}

	@Override
	public String test4(TestBean bean) {
		System.out.println("delete:" + bean.getId());
		return null;
	}

}