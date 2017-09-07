package demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User user =  new User("user", "pass",0);


    @Test
    public void getName() throws Exception {
        Assert.assertEquals(user.getName(), "user");
    }

    @Test
    public void setName() throws Exception {
        Assert.assertEquals(user.getName(), "user");
        user.setName("Re_User");
        Assert.assertEquals(user.getName(), "Re_User");
    }

    @Test
    public void getPass() throws Exception {
        Assert.assertEquals(user.getPass(), "pass");
    }

    @Test
    public void setPass() throws Exception {
        Assert.assertEquals(user.getPass(), "pass");
        user.setPass("Re_pass");
        Assert.assertEquals(user.getPass(), "Re_pass");
    }

    @Test
    public void equalsPass() throws Exception {
        final User _user = new User("user","pass",10);
        Assert.assertTrue(user.equals(_user));
    }

    @Test
    public void equalsFail() throws Exception {
        final User _user = new User("mock","pass",0);
        Assert.assertFalse(user.equals(_user));
    }
}