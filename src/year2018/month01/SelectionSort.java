package year2018.month01;

import helper.ArrayHelper;
import helper.RunInterface;

/**
 * 每天一个算法学习
 * 选择排序
 * selectionSort
 * 2018/01/15 at night
 */
public class SelectionSort implements RunInterface {

    /**
     * 实现思想：遍历 A
     * 从[i...length-1]中找出最小值与 A[i] 交换位置
     */
    public void sort(int[] A) {

        for (int i = 0; i < A.length; i++) {
            // minkey 指示最小值的位置
            int minKey = i;

            for(int j = i+1;j<A.length;j++){
                if(A[j]<A[minKey]){
                    minKey = j;
                }
            }
            //交换位置
            int temp = A[i];
            A[i] = A[minKey];
            A[minKey] = temp;
        }

    }

    @Override
    public void run(int[] A) {
        sort(A);
    }
}
