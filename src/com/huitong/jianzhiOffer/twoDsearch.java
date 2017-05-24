package com.huitong.jianzhiOffer;

/**
 * Created by allen on 2017/5/24.
 */
public class twoDsearch {


    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        if (array == null)
            return false;
        int i = array[0].length - 1, j = 0;
        while (i >= 0 && j <= array.length-1){
            if(target < array[j][i]){
                i--;
            } else if (target > array[j][i]){
                j++;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int target = 7;
        int[][] array = {
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        twoDsearch obj = new twoDsearch();
         System.out.println(obj.Find(target, array));

    }



}
