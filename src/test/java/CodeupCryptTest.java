import org.junit.Test;

import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test

    public void testIfVersionIsSet() {
        assertEquals(0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.5;
        assertEquals(1.5, CodeupCrypt.version, 0);
    }

    @Test

    public void testIfHashPasswordWorks() {
        assertEquals("br3", CodeupCrypt.hashPassword("bre"));
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("Br00k3", CodeupCrypt.hashPassword("Brooke"));
    }

    @Test

    public void testIfCheckPasswordWorks() {
        assertTrue(CodeupCrypt.checkPassword("brett", "br3tt"));
        assertFalse(CodeupCrypt.checkPassword("br3", "bre"));
    }

}
