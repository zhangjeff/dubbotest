package com.jeff;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BootdemoApplication{

	public static void main(String[] args) {
		Main.main(args);
//    	SpringApplication.run(BootdemoApplication.class, args);
	}
}
