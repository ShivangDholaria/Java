package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array of characters chars, compress it using the following algorithm:
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 *      If the group's length is 1, append the character to s.
 *      Otherwise, append the character followed by the group's length.
 * 
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars. 
 * Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * After you are done modifying the input array, return the new length of the array.
 * You must write an algorithm that uses only constant extra space.
 */

public class StringCompression {

    public static int compress_1(char[] chars) {
        char c = chars[0];
        List<Character> char_arr = new ArrayList<>();
        int count = 0, i = 0;

        for(char chr : chars) {
            if(chr == c)
                count++;
            if(chr != c) {
                if(count == 1){
                    char_arr.add(c);
                    c = chr;                    
                }
                else{
                    char_arr.add(c);
                    if(count >= 10) {
                        for(char c1 : String.valueOf(count).toCharArray())
                            char_arr.add(c1);
                    }
                    else
                        char_arr.add((char) ('0' + count));
                    c = chr;
                }
                count = 1;
            }
        }

        if(count == 1)
            char_arr.add(c);
        else {
            char_arr.add(c);
            if(count < 10)
                char_arr.add((char) ('0' + count));
            else 
                for(char c1 : String.valueOf(count).toCharArray())
                    char_arr.add(c1);
        }

        for(char c1 : char_arr)
            chars[i++] = c1;

        return char_arr.toArray().length;
    }

    //2nd Sol -
    public static int compress_2(char[] chars) {
        int ans = 0; // keep track of current position in compressed array

        // iterate through input array using i pointer
        for (int i = 0; i < chars.length;) {
          final char letter = chars[i]; // current character being compressed
          int count = 0; // count of consecutive occurrences of letter
    
          // count consecutive occurrences of letter in input array
          while (i < chars.length && chars[i] == letter) {
            ++count;
            ++i;
          }
    
          // write letter to compressed array
          chars[ans++] = letter;
    
          // if count is greater than 1, write count as string to compressed array
          if (count > 1) {
            // convert count to string and iterate over each character in string
            for (final char c : String.valueOf(count).toCharArray()) {
              chars[ans++] = c;
            }
          }
        }
    
        // return length of compressed array
        return ans;
    }

    // 3rd Sol
    public static int compress_3(char[] chars) {
        int pointer=0;
        int currCount=0;
        char prev=chars[0];
        for (char c: chars){
            if (c!=prev){
                chars[pointer++]=prev;
                if (currCount>9){
                    for (char curr : String.valueOf(currCount).toCharArray()) chars[pointer++]=curr;
                } else{
                    if (currCount>1){
                        chars[pointer++]=((char) (currCount+'0'));
                    }
                    
                }
                currCount=1;
                prev=c;
            } else{
                currCount++;
            }
        }
        chars[pointer++]=prev;
        if (currCount>9){
            for (char curr : String.valueOf(currCount).toCharArray()) chars[pointer++]=curr;
        } else{
            if (currCount>1){
                chars[pointer++]=((char) (currCount+'0'));
            }
            
        }
        return pointer;
    }

    public static void main(String[] args) {
        char[] c1 = new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'}, c2 = new char[] {'a'}, c3 = new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    
        System.out.println(compress_1(c1));
        System.out.println(compress_1(c2));
        System.out.println(compress_1(c3));
    }
}
