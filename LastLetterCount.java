package com.yuanhang.stringExercises;

/**
 * @author zyhang
 * @create 2020-09-16 9:50 AM
 */
public class LastLetterCount {

    public LastLetterCount() {
    }

    public void countAndSwitch(String str) {
        String[] words = str.split(" ");
        int cntEndS = 0;
        int cntEndY = 0;
        // the first word index that ending s/y
        int firstEndSIndex = -1;
        int firstEndYIndex = -1;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.charAt(word.length()-1) == 's' || word.charAt(word.length()-1) == 'S') {
                if (cntEndS == 0) {
                    firstEndSIndex = i;
                }
                cntEndS++;
            } else if (word.charAt(word.length()-1) == 'y' || word.charAt(word.length()-1) == 'Y') {
                if (cntEndY == 0) {
                    firstEndYIndex = i;
                }
                cntEndY++;
            }
        }

        // we have words ending in s and y separately
        if (firstEndSIndex != -1 && firstEndYIndex != -1) {
            String temp = words[firstEndSIndex];
            words[firstEndSIndex] = words[firstEndYIndex];
            words[firstEndYIndex] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]).append(" ");
        }
        //delete last space
        sb.deleteCharAt(sb.length()-1);
        String afterSwitch = sb.toString();

        System.out.println("thr number of words ending with s is: " + cntEndS);
        System.out.println("thr number of words ending with y is: " + cntEndY);

        System.out.println("the new string after switch is: " + afterSwitch);
    }


}
