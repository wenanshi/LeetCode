package com.leetcode.test_2;

public class Test2 {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		Test2 t2 = new Test2();
		t2.addTwoNumbers(l1,l2);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1==null||l2==null){
			return new ListNode(0);
		}
		int first = 0;
		int second = 0;
		int record = 0;
		ListNode ln = new ListNode(record);
		ListNode p3 = ln;
		while(l1!=null||l2!=null){

			if(l1!=null){
				record = record + l1.val;
				l1 = l1.next;
			}

			if(l2 != null){
				record = record + l2.val;
				l2 = l2.next;
			}

			p3.next = new ListNode(record%10);

			record = record/10;
			p3 = p3.next;
		}
		if(record==1)
			p3.next=new ListNode(1);
		return ln.next;
	}

	

}
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}