package year2018.month01;

import helper.RunInterface;

/**
 * 每天一个经典算法学习
 * 堆排序
 * HeapSort
 * 实现思路：
 * 首先，按堆的定义将数组R[0..n]调整为堆（这个过程称为创建初始堆），交换R[0]和R[n]；
 * 然后，将R[0..n-1]调整为堆，交换R[0]和R[n-1]；
 * 如此反复，直到交换了R[0]和R[1]为止。
 *
 * 以上思想可归纳为两个操作：
 *
 *（1）根据初始数组去构造初始堆（构建一个完全二叉树，保证所有的父结点都比它的孩子结点数值大）。
 *
 *（2）每次交换第一个和最后一个元素，输出最后一个元素（最大值），然后把剩下元素重新调整为大根堆。
 *
 * 2018/01/20
 */
public class HeapSort implements RunInterface {
/*
    什么是堆？
        堆是有以下性质的完全二叉树
        * 每个结点的值都大于或等于其左右孩子结点的值，称为大顶堆； arr[i] >= arr[2i+1] && arr[i] >= arr[2i+2]
        * 每个结点的值都小于或等于其左右孩子结点的值，称为小顶堆; arr[i] <= arr[2i+1] && arr[i] <= arr[2i+2]

    完全二叉树满足以下规律：
    (1) 它的左孩子结点是：R[2*i+1];
    (2) 它的右孩子结点是：R[2*i+2];
    (3) 它的父结点是：R[(i-1)/2];
 */


    /**
     * 调整方法
     * @param arr 待排序数组
     * @param parent 父节点
     * @param length 执行调整的长度
     */
    public void heapAdjust(int[] arr , int parent, int length){
        //保存父节点的值
        int temp = arr[parent];
        //获取左孩子节点
        int child = parent * 2 + 1;

        while(child < length){
            // 如果父节点有右孩子节点，且右孩子节点大于左孩子节点，选取右孩子节点
            if(child+1 < length && arr[child+1] > arr[child]){
                child ++;
            }

            // 如果父节点大于孩子节点，退出循环
            if(temp>arr[child]){
                break;
            }

            // 把孩子节点的值赋值给父节点
            arr[parent] = arr[child];

            // 选取孩子节点的左孩子节点，继续筛选
            parent = child;
            child = parent * 2 + 1;
        }

        //把原父节点的值放入筛选后应该存在的位置
        arr[parent] = temp;
    }

    public void sort(int[] arr){
        //循环建立初始堆
        for(int i = arr.length/2;i>=0;i--){
            heapAdjust(arr,i,arr.length);
        }

        int temp;

        //进行排序
        for(int i = arr.length - 1;i>0;i--){
            // 交换第一个元素和最后一个元素
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // 筛选节点，保证arr[0]为i-1个节点的堆中的最大值
            heapAdjust(arr,0,i);
        }
    }

    @Override
    public void run(int[] A) {
        sort(A);
    }
}
