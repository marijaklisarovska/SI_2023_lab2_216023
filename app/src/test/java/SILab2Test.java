import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SILab2Test {
    private List<User> createList(User...users) {
        return new ArrayList<>(Arrays.asList(users));
    }

    @Test
    public void everyBranchTests() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
        User user1 = new User(null, "ab mk@gmailcom", "mk@gmailcom");
        User user2 = new User("user", "!", "mk@yahoo.com");
        User user3 = new User("user", "m k!", "mk@yahoo.com");
        User user4 = new User("user", "password", "mk@yahoo.com");
        List<User> allUsers = createList();
        assertFalse(SILab2.function(user1, allUsers));
        assertFalse(SILab2.function(user2, allUsers));
        assertFalse(SILab2.function(user3, allUsers));
        assertFalse(SILab2.function(user4, allUsers));
    }

    @Test
    public void multipleConditionsTests() {
        User nullUser = null;
        User nullPassword = new User("username", null, "mk@yahoo.com");
        User nullEmail = new User("username", "password!!", null);
        List<User> allUsers2 = createList();
        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.function(nullUser, allUsers2));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
        RuntimeException exception2 = assertThrows(RuntimeException.class, () -> SILab2.function(nullPassword, allUsers2));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
        RuntimeException exception3 = assertThrows(RuntimeException.class, () -> SILab2.function(nullEmail, allUsers2));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
        User user4 = new User("username", "password", "email");
        assertFalse(SILab2.function(user4, allUsers2));

    }

}