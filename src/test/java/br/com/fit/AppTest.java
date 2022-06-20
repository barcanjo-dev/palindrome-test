package br.com.fit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkPalindromeWord() {
        App app = new App();

        assertTrue(app.isPalindromeWord("Rotator"));
        assertTrue(app.isPalindromeWord("bob"));
        assertTrue(app.isPalindromeWord("madam"));
        assertTrue(app.isPalindromeWord("mAlAyAlam"));
        assertTrue(app.isPalindromeWord("1"));
        assertTrue(app.isPalindromeWord("Able was I, ere I saw Elba"));
        assertTrue(app.isPalindromeWord("Madam I’m Adam"));
        assertTrue(app.isPalindromeWord("Step on no pets."));
        assertTrue(app.isPalindromeWord("Top spot!"));
        assertTrue(app.isPalindromeWord("02/02/2020"));
        assertTrue(app.isPalindromeWord("Socorram-me subi no ônibus em marrocos"));

        assertFalse(app.isPalindromeWord("xyz"));
        assertFalse(app.isPalindromeWord("elephant"));
        assertFalse(app.isPalindromeWord("Country"));
        assertFalse(app.isPalindromeWord("Top . post!"));
        assertFalse(app.isPalindromeWord("Wonderful-fool"));
        assertFalse(app.isPalindromeWord("Wild imagination!"));
    }
}
