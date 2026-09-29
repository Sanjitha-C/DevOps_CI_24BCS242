import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoginAppTest {
    @Test
    void validLoginReturnsTrue() {
        assertTrue(LoginApp.login("sanjitha", "12345"));
    }

    @Test
    void invalidPasswordReturnsFalse() {
        assertFalse(LoginApp.login("sanjitha", "wrong"));
    }

    @Test
    void invalidUsernameReturnsFalse() {
        assertFalse(LoginApp.login("someone", "12345"));
    }

    @Test
    void nullInputReturnsFalse() {
        assertFalse(LoginApp.login(null, "12345"));
        assertFalse(LoginApp.login("sanjitha", null));
    }
}