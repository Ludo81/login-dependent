package geco.geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User us;

    @Before
    public void setUp() throws Exception {
        us = new User();
    }

    @Test
    public void getRandomPassword() {
        String passw = us.getRandomPassword();
        System.out.println(passw);
        assertEquals(passw.length(), 8);
    }
}