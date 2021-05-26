package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: shangjinyu
 * @create: 2021-05-26 11:38
 **/
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        if(s == null || s.length() < 1){
            return result;
        }
        int start = 0, end = 0;
        Set<Character> charSet = new HashSet<>();
        while (true){
            while (!charSet.contains(s.charAt(end))){
                charSet.add(s.charAt(end));
                end++;
                if(end == s.length()){
                    return Math.max(charSet.size(), result);
                }
            }
            result = Math.max(result,charSet.size());
            while (s.charAt(start) != s.charAt(end)){
                charSet.remove(s.charAt(start));
                start++;
            }
            charSet.remove(s.charAt(start));
            start++;
        }
    }
}
