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
        System.out.println(test.isMatch("aa","a"));
    }

    public boolean isMatch(String s, String p) {
//        char[] c1 = s.toCharArray();
//        char[] c2 = p.toCharArray();
//
//        boolean result = true;
//
//        int j = 0;
//        int i = 0;
//
//        while(i<c2.length){
//
//
//            while(j<c1.length){
////                System.out.println(c2[i]!=c1[j]);
////                System.out.println(c1[i+1]!='.'&&c1[i+1]!='*');
//                if(c2[i]=='.'){
//                    continue;
//                }else if(c2[i]=='*') {
//                    return true;
//                }else if(c2[i]!=c1[j]&&(i+1!=c2.length&&c2[i+1]!='.'&&c2[i+1]!='*')){
//                    return false;
//                }
//
//                if(c2[i]==c1[j]){
//                    j++;
//                    break;
//                }else{
//                    j++;
//                }
//
//            }
//
//            if(j==c1.length){
//                break;
//            }
//
//            i++;
////
////            if(i==0&&j==0){
////                result = false;
////            }
//
//        }
//
//        if(j==c1.length&&i==0){
//            return false;
//        }



//        return result;

        if(p.length()==0) return s.length()==0;
        else if(s.length()==0) {
            if(p.length()>1 && p.charAt(1)=='*') return isMatch(s, p.substring(2));
            else return false;
        } else if(p.length()>1 && p.charAt(1)=='*') {
            if(isMatch(s,p.substring(2))) return true;
            else if(s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') {
                return isMatch(s.substring(1), p);
            } else {
                return false;
            }
        } else {
            return (s.charAt(0)==p.charAt(0) || p.charAt(0)=='.') && isMatch(s.substring(1), p.substring(1));
        }
    }

}
