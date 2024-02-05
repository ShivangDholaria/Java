package LeetCode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToNumber {
    //1st method
    public static int romanToNumber_1(String s)
    {
        int ans = 0, prev = 0, num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {         //Taking roman digits from the end
            switch (s.toUpperCase().charAt(i)) {
                case 'I':   num = 1; break;
                case 'V':   num = 5; break;
                case 'X':   num = 10; break;
                case 'L':   num = 50; break;
                case 'C':   num = 100; break;
                case 'D':   num = 500; break;
                case 'M':   num = 1000; break;
            }

            if (num < prev)                                 //Checks if the prev number was greater than the current one. For cases such as "Iv", "IX", etc.
                ans -= num;
            else
                ans += num;
        prev = num;                                         // Setting current number as prev
        }
        return ans;
    }    

    //2nd method
    public static int romanToNumber_2(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();          // Creating HashMap of Roman characters and its corresponding value
        int ans = 0;

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if ((i < s.length() - 1) && (m.get(s.charAt(i)) < m.get(s.charAt(i + 1))))  // Checking for seq such as "Iv", "IX", etc.
                ans -= m.get(s.charAt(i)); 
            else
                ans += m.get(s.charAt(i));
        }

        return ans;
    }
    public static void main(String[] args) {
        String a = "LVIII" , b = "III", c = "MCMXCIV";

        System.out.println(romanToNumber_1(a));
        System.out.println(romanToNumber_2(b));
        System.out.println(romanToNumber_1(c));
    }
}
