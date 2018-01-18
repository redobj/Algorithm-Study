package year2018.month01;

import helper.RunInterface;

/**
 * 每天一个经典算法学习
 * 快速排序
 * QuickSort
 * 平均时间复杂度 O(nlgn)
 * 2018/01/19
 */
public class QuickSort implements RunInterface {
    /*
    实现思路（分治法）：
    1．先从数列中取出一个数作为基准数。

    2．分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。

    3．再对左右区间重复第二步，直到各区间只有一个数。
     */

    /**
     * 按基准数切割数组
     * @param arr 待分割数组
     * @param startIndex 开始位置
     * @param endIndex 结束位置
     * @return
     */
    public int cutting(int[] arr,int startIndex,int endIndex){
        //基准数
        int flag = arr[startIndex];
        //左指针
        int leftIndex = startIndex;
        //右指针
        int rightIndex = endIndex;

        while(leftIndex<rightIndex){
            //右指针出发 ：找比基准数小的数
            while(leftIndex<rightIndex && arr[rightIndex]>=flag){
                rightIndex--;
            }

            //找到后把它放在左指针的位置
            arr[leftIndex] = arr[rightIndex];

            //左指针出发 ：找比基准数大的数
            while (leftIndex<rightIndex && arr[leftIndex]<=flag){
                leftIndex++;
            }

            //找到后把它放在右指针的位置
            arr[rightIndex] = arr[leftIndex];

        }

        //把基准数放在左右指针相遇的位置
        arr[leftIndex] = flag;

        //返回基准数即分割的位置
        return leftIndex;
    }

    /**
     * 排序核心算法
     * @param arr 待排序数组
     * @param startIndex 开始位置
     * @param endIndex 结束位置
     */
    public void sort(int[] arr,int startIndex,int endIndex){
        if(startIndex<endIndex){
            int index = cutting(arr,startIndex,endIndex);
            sort(arr,startIndex,index-1);
            sort(arr,index+1,endIndex);
        }
    }


    @Override
    public void run(int[] A) {
        sort(A,0,A.length-1);
    }

}
