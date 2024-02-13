import org.junit.Test;
import static org.junit.Assert.*;

public class TestRomanNumeral {
    
    @Test
    public void testRomanToInt() {
        RomanNumeral romanNumeral = new RomanNumeral();
        
        // Test cases for converting Roman numerals to integers
        assertEquals(3, romanNumeral.romanToInt("III"));
        assertEquals(4, romanNumeral.romanToInt("IV"));
        assertEquals(9, romanNumeral.romanToInt("IX"));
        assertEquals(58, romanNumeral.romanToInt("LVIII"));
        assertEquals(1994, romanNumeral.romanToInt("MCMXCIV"));
        
        // Test cases for single letters
        assertEquals(1, romanNumeral.romanToInt("I"));
        assertEquals(5, romanNumeral.romanToInt("V"));
        assertEquals(10, romanNumeral.romanToInt("X"));
        assertEquals(50, romanNumeral.romanToInt("L"));
        assertEquals(100, romanNumeral.romanToInt("C"));
        assertEquals(500, romanNumeral.romanToInt("D"));
        assertEquals(1000, romanNumeral.romanToInt("M"));
    }
}

