package year2018.month01;

import helper.ArrayHelper;
import helper.RunInterface;

/**
 * 每天一个经典算法学习
 * 插入排序
 * insertionSort
 * 时间复杂度 O(n^2)
 * 2018/01/15
 */
public class InsertionSort implements RunInterface {

    public void sort(int[] A){
        // int[] A 为 待排序数组

        /**
         * for 表示迭代开始
         * 包含 nums[0..j-1] 表示手中已排好序的牌
         * 及 nums[j+1..length-1] 表示桌面上的牌堆
         * j 指示正在插入到手中的"当前牌" 从第二张牌即98开始
         *
         */
        for(int j = 1;j<A.length;j++){
            // 当前牌的值
            int key = A[j];
            // 指示 j-1 [0..j-1]表示已排好序的牌
            int i = j-1;
            /**
             * 迭代比对[j-1..0]
             * 知道比对到小于key的值或比对到第一张牌
             */
            while(i>=0 && A[i]>key){
                //把大于key的数值后移一位
                A[i+1] = A[i];
                i = i-1;
            }
            // i+1 指示 key 插入的正确位置
            A[i+1] = key;
        }
    }


    @Override
    public void run(int[] A) {
        sort(A);
    }
}
