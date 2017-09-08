package platform;

import demo.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UserDAOTest {

    private UserDAO userDAO;

    @Before
    public void setUp() throws Exception {
        userDAO = UserDAO.create();
    }

    @After
    public void tearDown() throws Exception {
        userDAO = null;
    }

    @Test
    public void create() throws Exception {
        Assert.assertNotNull(userDAO);
    }

    @Test
    public void add() throws Exception {
        final User expected = new User("Vic","Bo",40);
        userDAO.add(expected);
        final User result = userDAO.get(40);

        Assert.assertEquals(result,expected);
    }

    @Test
    public void addAll() throws Exception {

        final User user1 = new User("Vic","Bo",85);
        final User user2 = new User("Ma","Bo",44);
        final User user3 = new User("Bo","Bo",12);

        userDAO.addAll(Arrays.asList(
                user1,
                user2,
                user3
        ));

        final User result1 = userDAO.get(85);
        Assert.assertEquals(result1,user1);

        final User result2 = userDAO.get(44);
        Assert.assertEquals(result2,user2);

        final User result3 = userDAO.get(12);
        Assert.assertEquals(result3,user3);
    }

    @Test
    public void get() throws Exception {
        final User expected = new User("Johan", "Johan12345", 0);
        final User update = userDAO.update(expected);

        final User result = userDAO.get(0);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void getList() throws Exception {
        final List<User> expected = new ArrayList<User>();
        Assert.assertEquals(expected, userDAO.getList());
    }

    @Test
    public void update() throws Exception {
        final User expected = new User("Vic","Boli",85);
        final User update = userDAO.update(expected);

        Assert.assertNotEquals(expected,update);
    }

    @Test
    public void delete() throws Exception {

        userDAO.delete(0);
        Assert.assertTrue(userDAO.size() == 6);
    }

    @Test
    public void deleteAll() throws Exception {
        userDAO.deleteAll();
        Assert.assertTrue(userDAO.size() == 0);
    }

}