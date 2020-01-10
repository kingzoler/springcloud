package test.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import com.codingapi.txlcn.tc.core.DTXServiceExecutor;
import com.codingapi.txlcn.tc.core.template.TransactionControlTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableDistributedTransaction
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
