package com.car.lease;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class LeaseCarApplication {

    public static void main(String[] args) {
//        SpringApplication.run(LeaseCarApplication.class, args);
        SpringApplication app = new SpringApplication(LeaseCarApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功!http://127.0.0.1:"+env.getProperty("server.port") + "/login/toLogin");
    }

}
