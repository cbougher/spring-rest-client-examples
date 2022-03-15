package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiServiceImplTest extends TestCase {

    @Autowired
    private ApiService apiService;

    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGetUsers() {
        List<User> users = apiService.getUsers(3);

        assertEquals(1, users.size());

        User user = users.get(0);

        System.out.println(user.getName().getFirst());

        assertNotNull(user);
    }
}