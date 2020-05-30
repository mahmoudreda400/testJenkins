package edu.miu.testjenkins.Services;

import edu.miu.testjenkins.services.UserServices;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    UserServices userServices;

    @Test
    public void sum_with1number() {
        String name = userServices.getUserName(102);
        assertEquals("mahmodu",name);
    }
}
