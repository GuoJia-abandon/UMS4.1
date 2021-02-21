package com.guo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guo.dao")
public class UmsSpringbootStarter {
	public static void main(String[] args) {
		SpringApplication.run(UmsSpringbootStarter.class,args);
	}
}
