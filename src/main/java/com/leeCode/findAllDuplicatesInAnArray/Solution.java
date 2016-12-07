package com.leeCode.findAllDuplicatesInAnArray;
//http://www.mamicode.com/info-detail-1585432.html
//http://www.cnblogs.com/rgvb178/p/6072428.html
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index = 1;
        while (index <= nums.length) {
            int next = nums[index-1];
            nums[index-1] = -1;
            while (next != -1 && next != index && -1 != nums[next-1] && next != nums[next-1]) {
                int tmp = nums[next-1];
                nums[next-1] = next;
                next = tmp;
            }

            if (next == -1) {
            }
            if (next == index) {
                nums[index-1] = next;
            }
            else if (-1 == nums[next-1]) {
                nums[next-1] = next;
            }
            else {
                list.add(next);

            }
            index++;
        }
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello!");
        Solution solution = new Solution();

        int[] nums = {4, 3, 2, 5, 5, 4, 8, 1};
        List<Integer> ret = solution.findDuplicates(nums);
        System.out.printf("ret len is %d\n", ret.size());
        Iterator iter = ret.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d,", iter.next());
        }
        System.out.println();

    }

}

