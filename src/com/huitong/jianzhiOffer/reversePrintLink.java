package com.huitong.jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by allen on 2017/5/24.
 * 主要是使用栈的先进后出思想
 */
public class reversePrintLink {



    public static void main(String[] args) {
        int[] nums = {1,3,5,7,89,12,45};
        ArrayList<Integer> result = new ArrayList<>();
        LinkedList<Integer> ints = new LinkedList<>();
        for (int i=0;i<nums.length;i++){
            ints.addLast(nums[i]);
        }

        while (!ints.isEmpty()){
            result.add(ints.removeLast());
        }

    }
}
