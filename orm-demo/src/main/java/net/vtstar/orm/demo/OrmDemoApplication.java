package net.vtstar.orm.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "net.vtstar.orm.demo.orm.mapper")
@SpringBootApplication
public class OrmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmDemoApplication.class, args);
    }

}
