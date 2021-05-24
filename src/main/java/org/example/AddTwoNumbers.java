package org.example;

import java.util.Objects;

/**
 * @description:
 * @author: shangjinyu
 * @create: 2021-05-24 15:00
 **/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryBit = 0;
        ListNode head = null, tail = null;
        while (Objects.nonNull(l1) || Objects.nonNull(l2)) {
            int val1 = Objects.nonNull(l1) ? l1.val : 0;
            int val2 = Objects.nonNull(l2) ? l2.val : 0;
            ListNode node = new ListNode((val1 + val2 + carryBit) % 10);
            carryBit = val1 + val2 + carryBit > 9 ? 1 : 0;
            if(head == null){
                head = tail = node;
            }else {
                tail.next = node;
                tail = tail.next;
            }
            if(Objects.nonNull(l1)){
                l1 = l1.next;
            }
            if(Objects.nonNull(l2)){
                l2 = l2.next;
            }
        }
        if(carryBit > 0){
            tail.next = new ListNode(carryBit);
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
