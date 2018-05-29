package com.winter.springbootmybatisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication

//@MapperScan("com.winter.mapper")//将项目中对应的mapper类的路径加进来就可以了
//@Service(value = 'userMapper')
//public interface UserMapper

public class SpringbootMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);

    }
}
