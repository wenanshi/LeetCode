package com.leetcode.test_7;

/**
 * Created with IntelliJ IDEA.
 * User: mary
 * Date: 2017/1/3
 * Time: 18:46
 * To change this template use File | Settings | File Templates.
 */
public class Test7 {
    public static void main(String[] args){
        Test7 test = new Test7();
        System.out.print(test.reverse(-10));
    }

    public int reverse(int x) {
        try{
            int index = 0;
            if(x<0){
                index = 1;
            }
            String s = String.valueOf(x);
            char[] c = s.toCharArray();
            int last = s.length()-1;
            for(int i=index,j=last;i<=j;i++,j--){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
            return new Integer(Integer.parseInt(new String(c)));
        }catch(NumberFormatException e){
            return 0;
        }

    }
}
