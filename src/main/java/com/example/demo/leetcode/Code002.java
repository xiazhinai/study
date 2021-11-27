package com.example.demo.leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;

//002
public class Code002 {


    public static void main(String[] args) {
        Code002 code1120 = new Code002();
        System.out.println(code1120.insertionSortList(null));

        System.out.println(new BigInteger("100000000000000000000001"));
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode ln1 = new ListNode(2);
        ln1.next = new ListNode(4);
        ln1.next.next = new ListNode(3);

        ListNode ln2 = new ListNode(5);
        ln2.next = new ListNode(6);
        ln2.next.next = new ListNode(4);

        return addTwoNumbers(ln1,ln2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuffer sb1 = new StringBuffer("");
        StringBuffer sb2 = new StringBuffer("");
        while (l1 != null) {
            sb1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            sb2.append(l2.val);
            l2 = l2.next;
        }
        BigInteger aa1 = new  BigInteger(sb1.reverse().toString());
        BigInteger aa2 = new BigInteger(sb2.reverse().toString());
        BigInteger sum = aa1.add(aa2);
        ListNode listNode = null;
        String[] age = (sum + "").split("");
        for (int i = age.length - 1; i >= 0; i--) {
            int a = Integer.parseInt(age[i]);
            if (listNode != null) {
                if (listNode.next != null) {
                    ListNode ln = listNode.next;
                    while (ln.next != null) {
                        ln = ln.next;
                    }
                    ln.next = new ListNode(a);
                } else {
                    listNode.next = new ListNode(a);
                }
            } else {
                listNode = new ListNode(a);
            }
        }
        return listNode;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }



}


