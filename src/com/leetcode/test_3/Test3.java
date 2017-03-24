package com.leetcode.test_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: mary
 * Date: 2016/7/22
 * Time: 10:13
 * To change this template use File | Settings | File Templates.
 */
public class Test3 {
    public static void main(String[] args) {

        Test3 t3 = new Test3();
        t3.lengthOfLongestSubstring("dvdf");
    }

    public int lengthOfLongestSubstring(String s) {
        char[] s1 = s.toCharArray();

        ArrayList<Character> s2 = new ArrayList<Character>();
        int max = 0;
        for(int i=0;i<s1.length;i++){
            int j = 0;
            for(;j<s2.size();j++){
                if(s1[i]==s2.get(j)){
                    if(max<s2.size()){
                        max = s2.size();
                    }
                    int k =0;
                    while(k<=j){
                        s2.remove(0);
                        k++;
                    }

                    break;
                }
            }

            s2.add(s1[i]);
            if(max<s2.size()){
                max = s2.size();
            }

        }

        return max;
    }
}
