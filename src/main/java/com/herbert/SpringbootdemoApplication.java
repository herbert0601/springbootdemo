package com.herbert;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 注意：该启动类默认就是在这个包下，把启动类移到其他包下会报错
 */
@SpringBootApplication
@MapperScan("com.herbert.dao") //扫描整个mapper包，将mapper代理类注入ioc管理，不用那么麻烦到每个接口去加@Mapper注解
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
