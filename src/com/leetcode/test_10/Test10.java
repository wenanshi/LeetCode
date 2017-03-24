package com.leetcode.test_10;

/**
 * Created with IntelliJ IDEA.
 * User: mary
 * Date: 2017/3/24
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */
public class Test10 {

    public static void main(String[] args) {
        Test10 test = new Test10();
        System.out.println(test.isMatch("abcd","d*"));
    };

    public boolean isMatch(String s, String p) {
        char[] c1 = s.toCharArray();
        char[] c2 = p.toCharArray();

        boolean result = true;

        int j = 0;

        for(int i=0; i>c2.length; i++){


            while(j<c1.length){

                if(c2[i]=='.'){
                    continue;
                }else if(c2[i]=='*') {
                    return true;
                }else if(c2[i]!=c1[j]){
                    return false;
                }else{
                    j++;
                    break;
                }

            }

            if(j<0&&i>0){
                return false;
            }

            if(i==0&&j==0){
                result = false;
            }

        }

        return result;
    }

}
