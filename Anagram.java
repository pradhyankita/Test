package com.BridgeLabz;
import java.util.Arrays;
public class Anagram {

        static void isAnagram(String str1, String str2) {
            String s1 = str1.replaceAll("\\s", "");
            String s2 = str2.replaceAll("\\s", "");
            
        }

        public static void main(String[] args) {
            isAnagram("Keep", "Peek");
            isAnagram("ab","ba");

        }
}

