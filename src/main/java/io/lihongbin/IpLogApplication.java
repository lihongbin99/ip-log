package io.lihongbin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.lihongbin.mapper")
public class IpLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpLogApplication.class, args);
    }

}
