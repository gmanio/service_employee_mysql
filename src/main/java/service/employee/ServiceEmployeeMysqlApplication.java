package service.employee;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching
public class ServiceEmployeeMysqlApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ServiceEmployeeMysqlApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
