package year2018.month01;

import helper.ArrayHelper;
import helper.RunInterface;

/**
 * 每天一个算法学习
 * 冒泡排序
 * BubbleSort
 * 时间复杂度O(n^2)
 * 2018/01/16
 */
public class BubbleSort implements RunInterface {

    public void sort(int[] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1;j< A.length;j++){

                if(A[i]>A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    @Override
    public void run(int[] A) {
        sort(A);
    }
}
