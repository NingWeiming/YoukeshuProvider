package cn.zjhn.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zjhn.common.mapper")
public class YoukeshuProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoukeshuProviderApplication.class, args);
	}

}
