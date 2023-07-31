package ph.maya.oss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JigsApp implements CommandLineRunner {

//    create a logger using SL4J
    private static final Logger logger = LoggerFactory.getLogger(JigsApp.class);


    public static void main(String[] args) {
        SpringApplication.run(JigsApp.class, args);
    }

    @Override
    public void run(String... args) {
        // Your application logic goes here
        logger.info("Hello, this is JIGS-DS running as a Spring Boot CLI App!");
    }
}