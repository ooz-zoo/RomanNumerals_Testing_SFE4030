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
        //mapping below is for the invalid letter Z
        map.put('Z', -1);
    //   map.put('V', -1); 
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

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
    
        // Initialize the converted number to 0
        int convertedNumber = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {

            // Get the current character
            char currentChar = s.charAt(i);
        // Check if the current character is not present in the Roman numeral mapping
            if (!map.containsKey(currentChar)) {

                // Throw an exception if the character is undefined
                throw new IllegalArgumentException("Invalid Roman numeral: contains undefined character.");
            }
            
            // Get the integer value corresponding to the current Roman numeral character
            int currentNumber = map.get(currentChar);

            // Get the integer value of the next Roman numeral character, if it exists, or set it to 0 otherwise
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;
            
            // Check if the current number is greater than or equal to the next number
            if (currentNumber >= next) {
                // If true, add the current number to the converted number
                convertedNumber += currentNumber;
            } else {
                // If false, subtract the current number from the converted number
                convertedNumber -= currentNumber;
            }

            // Check for undefined characters such as letter Z
            if (currentNumber == -1) {
                throw new IllegalArgumentException("Invalid Roman numeral: contains undefined character.");
            }
        }
        
        // Check for invalid patterns
        if (s.contains("VV") || s.contains("IIII") || s.contains("XXXX") || s.contains("CCCC") ||
            s.contains("DD") || s.contains("LL") || s.contains("VVV") || s.contains("LLL") || s.contains("DDD")) {
            throw new IllegalArgumentException("Invalid Roman numeral: contains invalid pattern.");
        }
    
        return convertedNumber;
    }
    
}
