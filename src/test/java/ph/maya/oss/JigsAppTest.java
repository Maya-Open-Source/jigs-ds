package ph.maya.oss;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
@DisplayName("JigsApp")
class JigsAppTest {

    @Test
    void contextLoads() {
        assertDoesNotThrow(() -> SpringApplication.run(JigsApp.class));
    }

}