package edu.bjtu.sse.djd.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO
 * @author 董金达
 * @date 10:59 2020/5/23
 * @param
 * @param null
 * @return
 **/
@SpringBootApplication
@MapperScan(value = "edu.bjtu.sse.djd.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
