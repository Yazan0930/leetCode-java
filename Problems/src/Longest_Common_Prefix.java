/*14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Min lösning:
välj den första ord som ska används för jämförelse
har en target som sparar den långaste prefix.

en forloop och tar första bokstav av ord som är valt och kollar om den startar med samma för alla, om den inte då stoppar vi.
 */

public class Longest_Common_Prefix {
    public static void main(String[] args) throws Exception {
        // String[] strs = {"dog","racecar","car"};
        String[] strs = {"flower","flow","flight"};

        String[] wordList = strs[0].split("");
        String compare = "";
        String result = "";
        int ok = 0;

        for(int i = 0; i < wordList.length; i++) {
            compare += wordList[i];
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].startsWith(compare)) {
                    // System.out.println(true + "\n" + strs[j] + " : " + compare);
                    ok++;
                }
                else {
                    break;
                }
            }

            if(ok == (strs.length - 1)) {
                result = compare;
                ok = 0;
            } else {
                break;
            }
        }

        System.out.println(result);
        
    }
}
