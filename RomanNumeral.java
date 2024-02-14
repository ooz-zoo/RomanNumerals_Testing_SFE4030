import java.util.Map;
import java.util.HashMap;
import java.util.Scanner; //necessary classes from the java.util package. Map and HashMap are used for mapping Roman numerals to their integer values
//Scanner is used for taking user input.
 
public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>(); //declares a static Map named map that maps characters (Roman numerals) to integers
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10); 
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('Z', -1);
    } //This block initializes the map with mappings of Roman numerals to their integer values. For example, 'I' is mapped to 1, 'V' to 5, and so on.

    public static void main(String[] args) { //defines the main method, the entry point of the program.
        Scanner scanner = new Scanner(System.in);  //Scanner object to read input from the user.

        System.out.print("Enter a Roman numeral: ");
        String input = scanner.nextLine();

        RomanNumeral romanNumeral = new RomanNumeral(); 
        int result = romanNumeral.romanToInt(input);

        System.out.println("Conversion result: " + result); //The program prompts the user to enter a Roman numeral and reads the input into the input variable.

        scanner.close(); 
    }

    public int romanToInt(String s) { //defines a method named romanToInt which takes a String parameter s representing a Roman numeral and returns an integer.
        int convertedNumber = 0; 
        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0; //It iterates through each character of the input Roman numeral (s). It retrieves the corresponding integer value from the map for the current character and the next character (if exists). Based on the values retrieved, it adds or subtracts the integer values to compute the total conversion.
            if (currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }
        return convertedNumber;
    }
}
