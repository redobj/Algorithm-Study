package year2018.month01;

import helper.ArrayHelper;
import helper.RunInterface;

/**
 * 每天一个算法学习
 * 希尔排序
 * ShellSort
 * 平均和最优 O(n * log(2 n))
 * 2018/01/18
 */
public class ShellSort implements RunInterface {

    /**
     * 希尔排序也称为 "缩小增量排序"
     * 基本原理：
     * 将待排序的数组分为若干子序列，使每个子序列的元素相对较少，然后对各子序列使用直接插入排序，待整个子序列基本有序后，最后再对所有元素使用一次直接插入排序
     *
     * @param A
     */
    public void sort(int[] A) {
        /*
        以{2，4，6，8，10，1，3，5，7，9}为例
        第一次 ：
                步长为 10/2 = 5
                比较 2 和 1 ，小的移到前面
                比较 4 和 3 ，小的移到前面
                ......
                比较 10 和 9 ，小的移到前面
                {1，3，5，7，9，2，4，6，8，10}
        第二次：
                步长为 5/2 = 2
                {1，3，5，7，9，2，4，6，8，10} 5 - 1
                {1，3，5，7，9，2，4，6，8，10} 7 - 3
                {1，3，5，7，9，2，4，6，8，10} 9 - 5
                {1，2，5，3，9，7，4，6，8，10} 2 - 7 ， 2 - 3
                {1，2，4，3，5，7，9，6，8，10} 4 - 9 ， 4 - 5 ，4 - 1
                {1，2，4，3，5，6，9，7，8，10} 6 - 7 ， 6 - 3
                {1，2，4，3，5，6，8，7，9，10} 8 - 9 ， 8 - 5
                {1，2，4，3，5，6，8，7，9，10} 10 - 7
        第三次：
                步长为 2/2 = 1
                ....
                {1，2,3，4，5，6，7，8，9，10}
         */
        // increment 希尔增量，步长
        for (int increment = A.length / 2; increment > 0; increment = increment / 2) {
            for (int i = increment; i < A.length; i++) {

                int temp = A[i];
                int j = 0;
                for (j = i - increment; j >= 0; j -= increment) {
                    if (temp < A[j]) {
                        // 把 小于当前 temp 的数 向前移动 increment
                        A[j+increment] = A[j];
                    }else{
                        break;
                    }
                }
                //把temp放在比它小的数的 increment 位置后
                A[j + increment ] = temp;
            }
        }
    }

    @Override
    public void run(int[] A) {
        sort(A);
    }

}
