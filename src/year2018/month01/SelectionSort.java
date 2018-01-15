package year2018.month01;

import helper.ArrayHelper;

/**
 * 每天一个算法学习
 * 选择排序
 * selectionSort
 * 2018/01/15 at night
 */
public class SelectionSort {


    public static void main(String[] args) {
        /**
         * 实现思想：遍历 a
         * 从[i...length-1]中找出最小值与 a[i] 交换位置
         */
        int[] a= ArrayHelper.getRandomInt(20,0,20);
        System.out.println("排序前");
        ArrayHelper.printArray(a);

        for (int i = 0; i < a.length; i++) {
            // minkey 指示最小值的位置
            int minKey = i;

            for(int j = i+1;j<a.length;j++){
                if(a[j]<a[minKey]){
                    minKey = j;
                }
            }
            //交换位置
            int temp = a[i];
            a[i] = a[minKey];
            a[minKey] = temp;
        }

        System.out.println("排序后");
        ArrayHelper.printArray(a);
    }

}
