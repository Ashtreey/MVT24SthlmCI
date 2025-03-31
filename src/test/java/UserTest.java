package MVT24SthlmCI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserConstructor() {
        User user = new User("Kalle", "password123");
        assertEquals("Kalle", user.getUserName());
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testSetUserName() {
        User user = new User("Kalle", "password123");
        user.setUserName("NewKalle");
        assertEquals("NewKalle", user.getUserName());
    }

    @Test
    public void testSetPassword() {
        User user = new User("Kalle", "password123");
        user.setPassword("newPassword456");
        assertEquals("newPassword456", user.getPassword());
    }

    @Test
    public void testIsPasswordStrong() {
        User strongUser = new User("Kalle", "password123");
        assertTrue(strongUser.isPasswordStrong());

        User weakUser = new User("Kalle", "weak");
        assertFalse(weakUser.isPasswordStrong());
    }

    @Test
    public void testValidatePassword() {
        User validUser = new User("Kalle", "password123");
        assertTrue(validUser.validatePassword());

        User invalidUser = new User("Kalle", "short");
        assertFalse(invalidUser.validatePassword());
    }
}