package cn.chaojibus.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import xyz.erupt.core.annotation.EruptScan;

@SpringBootApplication
@ComponentScan({"xyz.erupt","cn.chaojibus.server"}) // ↓ com.xxx要替换成实际需要扫描的代码包
@EntityScan({"xyz.erupt","cn.chaojibus.server"})    // ↓ 例如DemoApplication所在的包为 com.example.demo
@EruptScan({"xyz.erupt","cn.chaojibus.server"})    
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
