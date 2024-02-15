import org.junit.*;

public class TestRomanNumeral {
    
    @Test
    public void testRomanToInt() {
        RomanNumeral romanNumeral = new RomanNumeral(); //object for the test class, it's an instance of a class that provides a method romanToInt for converting Roman numerals to integers
        
        // Test cases for converting Roman numerals to integers
        //Assert.assertEquals is a method provided by JUnit that's used to verify whether two values are equal
        //Assert.assertEquals compares first and second arguement if equal
        Assert.assertEquals(3, romanNumeral.romanToInt("III")); //It's a test assertion that checks whether the romanNumeral.romanToInt method returns a value equal to 1, 
        //If the actual value returned by romanNumeral.romanToInt("III") matches the expected value 3, the test passes. If they're not equal, the test fails, and an error is thrown.
        Assert.assertEquals(58, romanNumeral.romanToInt("LVIII"));
        Assert.assertEquals(1994, romanNumeral.romanToInt("MCMXCIV"));
        
        // Test case for single letters
        Assert.assertEquals(1, romanNumeral.romanToInt("I"));
        Assert.assertEquals(5, romanNumeral.romanToInt("V"));
        Assert.assertEquals(10, romanNumeral.romanToInt("X"));
        Assert.assertEquals(50, romanNumeral.romanToInt("L"));
        Assert.assertEquals(100, romanNumeral.romanToInt("C"));
        Assert.assertEquals(500, romanNumeral.romanToInt("D"));
        Assert.assertEquals(1000, romanNumeral.romanToInt("M"));

        //Test case for Many Letters
        Assert.assertEquals(9, romanNumeral.romanToInt("IX"));
        Assert.assertEquals(53, romanNumeral.romanToInt("LIII"));
        Assert.assertEquals(520, romanNumeral.romanToInt("DXX"));
        Assert.assertEquals(1040, romanNumeral.romanToInt("MXL"));

        //Test case for Substractive notation
        Assert.assertEquals(10-1, romanNumeral.romanToInt("IX"));
        Assert.assertEquals(54-1, romanNumeral.romanToInt("LIII"));
        Assert.assertEquals(200-5, romanNumeral.romanToInt("CXCV"));

        //Test case for Repetition
        Assert.assertEquals(2, romanNumeral.romanToInt("II"));
        Assert.assertEquals(3, romanNumeral.romanToInt("III"));

        //Test case for First Number
        Assert.assertEquals(1, romanNumeral.romanToInt("I"));

        //Test case for Invalid Letter
        Assert.assertEquals(-1, romanNumeral.romanToInt("Z")); //Errors here 
        
        //Test case for 


    }
}

