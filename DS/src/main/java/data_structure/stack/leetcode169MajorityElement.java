package data_structure.stack;

import java.util.List;
import java.util.Stack;

public class leetcode169MajorityElement {
    public int majorityElement(final List<Integer> A) {
        int count = 0;
        int maj = 0;
        int len = A.size();
        Stack<Integer> stack = new Stack<>();
        for (int a : A) {
            stack.push(a);
        }
        for (int s : stack) {
            if (count == 0) {
                maj = s;
                count++;
            } else {
                if (s == maj) count++;
                else count--;
            }
        }

        count = 0;
        for (int e : stack) {
            if (e == maj)
                count++;
        }
        int res = 0;
        if (count > len / 2)
            res = maj;
        return res;
    }
}
