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
        int result = 0, start = 0, end = 0;
        if(s == null || s.length() < 1){
            return result;
        }
        Set<Character> charSet = new HashSet<>();
        while (true){
            while (!charSet.contains(s.charAt(end))){
                charSet.add(s.charAt(end++));
                result = Math.max(result,charSet.size());
                if(end == s.length()){
                    return result;
                }
            }
            charSet.remove(s.charAt(start++));
        }
    }
}
