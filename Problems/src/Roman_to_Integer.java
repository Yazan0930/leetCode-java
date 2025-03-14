/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.


Min lösning:
om jag har en hashmap med key av sting och value av integer
sedan splittar Input: s = "LVIII" i en lista 
jag löppar genom det:
    kollar om list[i] är större än key som finns i hashmap då adderar man om den mindre då minskar man list[i + 1] - list[i]
    
sedan retunera svaret
 */

import java.util.HashMap;

public class Roman_to_Integer {
    public static void main(String[] args) throws Exception {
        String s = "IM";

        String [] target = s.split("");
        int result = 0;

        HashMap<String, Integer> romanMapValue = new HashMap<String, Integer>();
        romanMapValue.put("I", 1);
        romanMapValue.put("V", 5);
        romanMapValue.put("X", 10);
        romanMapValue.put("L", 50);
        romanMapValue.put("C", 100);
        romanMapValue.put("D", 500);
        romanMapValue.put("M", 1000);

        for(int i = 0; i < target.length - 1; i++) {
            // System.out.println(romanMapValue.get(target[i]) + " > " + romanMapValue.get(target[i + 1]));
            
            if (romanMapValue.get(target[i]) > romanMapValue.get(target[i + 1])) {
                System.out.println(target[i] + " > " + target[i + 1]);
                result += romanMapValue.get(target[i]); 
            }
            else if (romanMapValue.get(target[i]) < romanMapValue.get(target[i + 1])) {
                System.out.println(target[i] + " < " + target[i + 1]);
                result -= romanMapValue.get(target[i]);
            }
            else if (romanMapValue.get(target[i]) == romanMapValue.get(target[i + 1])) {
                System.out.println(target[i] + " = " + target[i + 1]);
                result += romanMapValue.get(target[i]); 
            }
        }
        // sista sympol jämförs inte med något därför adderas den separat
        result += romanMapValue.get(target[target.length - 1]); 

        
        System.out.println(result);
    }
}
