package dao;

import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.User;

import java.util.List;

/**
 * Created by Koche on 2016/4/22.
 */
public class UserDaoTest extends TestCase {
    private ApplicationContext context = null;
    private User user = null;
    private UserDao userDAO = null;
    public void setUp() throws Exception {
        super.setUp();
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        userDAO = (UserDao)context.getBean("userDAO");
    }
    public void tearDown() throws Exception {
        userDAO = null;
        user = null;
    }
    public void testAddUser() throws Exception {
        user = new User();
        user.setUsername("username");
        user.setPassword("password");
        userDAO.addUser(user);
        Assert.assertNotNull(user.getId());
        User userTwo = new User();
        userTwo.setUsername("username1");
        userTwo.setPassword("password");
        userDAO.addUser(userTwo);
        Assert.assertNotNull( user.getId());
    }
    public void testListAll() throws Exception {
        List<User> users = userDAO.listAll();
        Assert.assertEquals(users.size(), 2);
    }
}
