package com.yuanhang.stringExercises;

/**
 * @author zyhang
 * @create 2020-09-16 9:50 AM
 */
public class Consonants {

    public Consonants() {
    }

    public void countAndReplaceConsonants(String str) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
                sb.append(c);
                continue;
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.append(c);
            } else {
                sb.append('*');
                cnt++;
            }
        }
        System.out.println("number of consonants is: " + cnt);
        System.out.println("after replace, the str is: " + sb.toString());
    }
}
