package service.employee;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ServiceEmployeeMysqlApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ServiceEmployeeMysqlApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
