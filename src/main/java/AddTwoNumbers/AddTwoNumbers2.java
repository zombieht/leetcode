package AddTwoNumbers;


import node.ListNode;

public class AddTwoNumbers2 {


    public ListNode addTwoNumber2(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;

        ListNode aa = new ListNode(1);
        ListNode bb = new ListNode(2);
        ListNode cc = new ListNode(3);
        bb.next = cc;
        aa.next = bb;

        l1 = aa;
        l2 = aa;

        Integer result1 = 0;
        Integer i1 = 0;
        Integer result2 = 0;
        Integer i2 = 0;
        while (l1 != null) {
            Double x = Math.pow(10, i1);
            result1 = l1.val * x.intValue() + result1;
            i1++;
            l1 = l1.next;
        }
        while (l2 != null) {
            Double x = Math.pow(10, i2);
            result2 = l2.val * x.intValue() + result2;
            i2++;
            l2 = l2.next;
        }

        Integer result = result1 + result2;
        String resultx = result.toString();
        char[] ret = resultx.toCharArray();
        ListNode now;
        ListNode last = new ListNode(0);
        int i = 0;
        int length = ret.length - 1;
        for (char c : ret) {
            if (i == 0) {
                now = new ListNode(c - '0');
                last = now;
            } else {
                ListNode now2 = last;
                last = new ListNode(c - '0');
                last.next = now2;
            }
            i++;
        }


        return last;
    }

}
