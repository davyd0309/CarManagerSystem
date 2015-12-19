package pl.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories(basePackages = "pl.cms.dao")
public class CarManagerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarManagerSystemApplication.class, args);
    }
}