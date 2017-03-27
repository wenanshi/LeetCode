package com.leetcode.test_373;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Test373 {

	public static void main(String[] args) {
		Test373 test = new Test373();
		int[] nums1 = {1,7,11};
		int[] nums2 = {2,4,6};
		test.kSmallestPairs2(nums1,nums2, 3);

	}
	public List<int[]> kSmallestPairs2(int[] nums1, int[] nums2, int k) {
		List<int[]> res = new LinkedList<>();
        Queue<int[]> queue = new PriorityQueue<>(k,new Comparator<int[]>(){
            public int compare(int[] o1,int[] o2){
                int tmp1 = o1[0]+o1[1];
                int tmp2 = o2[0]+o2[1];

                return tmp1 - tmp2;
            }            
        });

       for(int i = 0;i<nums1.length;i++){
           for(int j = 0;j<nums2.length;j++){
               queue.add(new int[]{nums1[i],nums2[j]});
           }
       }

       while(k-->0){
           int[] tmp = queue.poll();
           if(tmp == null)
                break;
            res.add(tmp);
       }

       return res;
	}
	
	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        TreeMap<Integer, ArrayList<int[]>> allPairs = new TreeMap<Integer,ArrayList<int[]>>(new Comparator<Integer>(){  
  
            /* 
             * int compare(Object o1, Object o2) 返回一个基本类型的整型， 
             * 返回负数表示：o1 小于o2， 
             * 返回0 表示：o1和o2相等， 
             * 返回正数表示：o1大于o2。 
             */  
            public int compare(Integer o1, Integer o2) {  
              
                //指定排序器按照降序排列  
                return o1.compareTo(o2);  
            }     
        });  
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
            	int key = nums1[i]+nums2[j];
            	ArrayList<int[]>list = allPairs.get(key);
            	if(list == null){
            		list = new ArrayList<int[]>();
            	}
            	int[] pair = {nums1[i],nums2[j]};
                list.add(pair);
                allPairs.put(key, list);
            }
        }
        List<int[]> result = new ArrayList<int[]>();
        for (Integer key : allPairs.keySet()) {
        	if(k<=0){
        		break;
        	}
        	ArrayList<int[]> l = allPairs.get(key);
        	if(l.size()>=k){
        		result.addAll(result.size(),l.subList(0, k));
        		break;
        	}
        	result.addAll(result.size(),l);
        	k = k-l.size();
        	
        }
        
        return result;
    }
	
	
}
