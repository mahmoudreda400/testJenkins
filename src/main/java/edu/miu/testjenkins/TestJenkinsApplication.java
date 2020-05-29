package edu.miu.testjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
        System.out.println(">>> test Jenkins <<< ");

    }

}
