package com.leetcode.test_5;

/**
 * Created with IntelliJ IDEA.
 * User: mary
 * Date: 2016/8/2
 * Time: 11:33
 * To change this template use File | Settings | File Templates.
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome1("a"));
    }



    public static String longestPalindrome1(String s) {

        if(s == null || s.length()==0)
            return "";
        boolean[][] palin = new boolean[s.length()][s.length()];
        String res = "";
        int maxLen = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j) && (j-i<=2 || palin[i+1][j-1]))
                {
                    palin[i][j] = true;
                    if(maxLen<j-i+1)
                    {
                        maxLen=j-i+1;
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }


}
