package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestPe {
    public static void main(String[] args) {
        String prefix = longestCommonPrefix();
        System.out.println(prefix);
       /* String[] string = {"dogg", "doggystca", "doggcdc"};
        String a1 = null;
        String a2 = null;
        ArrayList<String> strings;
        for (int i = 0; i < string.length - 1; i++) {
            a1 = string[i];
            a2 = string[i + 1];
        }
        for (int j = 0; j < string.length; j++) {
            char charAt = a1.charAt(j);
            char char2 = a2.charAt(j);
            if (charAt == char2) {
                strings = new ArrayList<>();
                strings.add(String.valueOf(char2));
                System.out.println(strings);

            }
        }*/
    }

        public static String longestCommonPrefix() {
            String[] strs={"dogg", "dogystca", "doggcdc"};
         // Arrays.sort(strs);
            for (int i=0;i<= strs.length;i++){
                String s1 = strs[i];
                String s2 = strs[i+1];

                int idx = 0;
                while(idx < s1.length() && idx < s2.length()){
                    if(s1.charAt(idx) == s2.charAt(idx)){
                        idx++;
                    } else {
                        break;
                    }
                }
            }
          //  return s1.substring(0, idx);
            return  "";
        }

}
