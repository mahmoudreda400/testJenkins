package edu.miu.testjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestJenkinsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
        System.out.println(">>> test Jenkins <<< ");

    }

}
