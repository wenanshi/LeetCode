package com.leetcode.test_9;

/**
 * Created with IntelliJ IDEA.
 * User: mary
 * Date: 2017/3/22
 * Time: 14:44
 * To change this template use File | Settings | File Templates.
 */
public class Test9 {

    public static void main(String[] args) {
        Test9 test = new Test9();
        System.out.println(test.isPalindrome(1005));
    }

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        if(x<10){
            return true;
        }

        if(x%10==0){
            return false;
        }
        String s = x+"";
        char[] c = s.toCharArray();
        int max = c.length-1;
        int min = 0;
        int length = c.length/2;
        while(max>=min){
            if(c[max]!=c[min]){
                return false;
            }
            max--;
            min++;
        }

        return true;
//        double count = 10;
//        int index = 0;
//        while(x/count>0){
//           count = count*10;
//           index ++;
//        }
//        double upper;
//        int lower;
//        while(x>10){
//            lower = 10;
//            upper =  Math.pow(10,index);
//            int a = x%lower;
//            double b = x/upper;
//            if(a != b){
//                return false;
//            }
//            x = (int)((x%upper)/lower);
//            index = index - 2;
//        }
//        if(index>0&&x!=0){
//            return false;
//        }
    }
}
