package test.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import com.codingapi.txlcn.tc.core.transaction.lcn.control.LcnTransactionCleanService;
import com.codingapi.txlcn.tc.txmsg.TCSideRpcInitCallBack;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "test.scin")
@EnableDistributedTransaction
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
