package cc.cc1234.api;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cc.cc1234")
@MapperScans(@MapperScan(basePackages = "cc.cc1234.dao.mapper"))
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}