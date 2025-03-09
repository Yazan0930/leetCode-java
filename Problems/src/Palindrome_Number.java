/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Solution;

// we divide the x and extract the decimal digit and later we reverset

// take out the last number 
// multiplay it with the length of the original "x" minus 1

// Divide the x with 10 to remove the last digit

// compare it if it Paliandrome
 */

public class Palindrome_Number {
    // print hellow world
    public static void main(String[] args) throws Exception {
        int x = -121;
        if (x < -1) {
            System.out.println(false);
            // return false;
        }

        int copyX = x;
        int length = String.valueOf(x).length();
        int y = x;
        int res = 0;

        // we divide the x and extrakt the decimal digit and later we reverset
        for(int i = 0; i < length; i++) {
            // take out the last number 
            y = y % 10;

            // multiplay it with the length of the original x minus 1
            res += y * (int)Math.pow(10, length - i - 1 );
            
            // Divide the x with 10 to remove the last digit
            x = x / 10;
            y = x;
        }

        // compare it if it Paliandrome
        if (copyX == res) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}