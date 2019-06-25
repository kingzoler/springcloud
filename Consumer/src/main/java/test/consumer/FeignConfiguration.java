package test.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;

@Configuration
public class FeignConfiguration {
	@Bean
	public ErrorDecoder errorDecoder(){
		return new UserErrorDecoder();
	}
	
	@Bean
	public RequestInterceptor requestInterceptor(){
		return new FeignRequestInterceptor();
	}
}
