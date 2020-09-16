package com.yuanhang.stringExercises;

/**
 * @author zyhang
 * @create 2020-09-16 9:49 AM
 */
public class Palindrome {

    public Palindrome() {
    }

    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public boolean isPalindrome(String str) {
        String reversedStr = reverse(str);
        return reversedStr.equals(str);
    }
}
