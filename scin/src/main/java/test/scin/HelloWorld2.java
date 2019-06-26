package test.scin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "service-provider", contextId = "h2")
public interface HelloWorld2 {
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2(@RequestParam("id") String id);
}
