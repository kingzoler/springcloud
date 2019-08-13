package test.scin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import test.scin.bean.TestBean;

@Component
@FeignClient(name = "service-provider", contextId = "h1")
public interface HelloWorld {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(@RequestParam("id") String id);

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test2(@RequestBody TestBean bean);

	@RequestMapping(value = "/test", method = RequestMethod.PUT)
	public String test3(@RequestBody TestBean bean);

	@RequestMapping(value = "/test", method = RequestMethod.DELETE)
	public String test4(@RequestBody TestBean bean);
}
