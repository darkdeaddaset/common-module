package liga.medical.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "liga.medical")
public class CommonMedical {
    public static void main(String[] args) {
        SpringApplication.run(CommonMedical.class, args);
    }
}
