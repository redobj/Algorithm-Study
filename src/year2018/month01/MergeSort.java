package year2018.month01;

import helper.ArrayHelper;
import helper.RunInterface;

/**
 * 每天一个算法学习
 * 归并排序
 * MergeSort
 * 时间复杂度O(nlog2 n)
 * 2018/01/16
 */
public class MergeSort implements RunInterface {


    /*

    A[] = {1,3,5,7,9,2,4,6,8,10}
    p = 0;
    q = 4;
    r = 9;
    n1 = 5;
    n2 = 5;
    arrL = {6,7,8,9,10}
    arrR = {1,2,3,4,5}
    A[0..4] 已排好序
    A[5..9] 已排好序

     */


    /**
     * p,q,r均为数组下标，且满足 p<=q<r
     * 假设A[p..q] A[q+1..r]都已排好序
     * 该方法 合并 两个数组代替当前子数组 A[p..r]
     * @param A 待合并数组A
     * @param p
     * @param q
     * @param r
     * @return
     */
   public static void merge(int[] A,int p,int q,int r){
       // 计算子数组 [p..q] 长度
       int n1 = q - p +1;
       // 计算子数组 [q+1..r] 长度
       //int n2 = r - (q+1) +1 = r - q;
       int n2 = r - q;
       // 创建 左子数组 ，+1为左子数组的哨兵预留位置
       int[] arrL = new int[n1 + 1];
       // 创建 右子数组， +1位右子数组的哨兵预留位置
       int[] arrR = new int[n2 + 1];

       //将 A[p..q]中的值复制到左子数组
       for (int i = 0; i < n1; i++) {
           arrL[i] = A[p+i];
       }


       //将 A[q+1..r]中的值复制到右子数组
       for (int j = 0;j < n2;j++){
           arrR[j] = A[q+j+1];
       }

       //为左右子数组设置哨兵
       arrL[n1] = Integer.MAX_VALUE;
       arrR[n2] = Integer.MAX_VALUE;


       /*
        合并左右子数组，维持循环不变式
        arrL[i] 为左子数组中的最小元素
        arrR[j] 为右子数组中的最小元素
        合并时从中筛选左右子数组的元素覆盖到A
        */
       int i = 0;
       int j = 0;
       for(int k = p;k <= r;k++)
       {
           if(arrL[i]<=arrR[j]){
               A[k] = arrL[i];
               i++;
           }
           else{
               A[k] = arrR[j];
               j++;
           }
       }
   }

    /**
     * 归并 无哨兵写法
     * @param A
     * @param p
     * @param q
     * @param r
     */
   public static void mergeWithout(int A[], int p, int q, int r){
       int[] arrL = new int[q-p+1];
       int[] arrR = new int[r-q];

       for(int i = 0;i<arrL.length;i++){
           arrL[i] = A[p+i];
       }

       for (int i = 0; i < arrR.length; i++) {
           arrR[i] = A[q+i+1];
       }

       int j = 0;
       int k = 0;
       for(int i = p;i<r+1;i++){
           if(j == arrL.length){
               A[i] = arrR[k];
               k++;
               continue;
           }
           if(k == arrR.length){
               A[i] = arrL[j];
               j++;
               continue;
           }
           if(arrL[j]<arrR[k]){
               A[i] = arrL[j];
               j++;
           }
           else{
               A[i] = arrR[k];
               k++;
           }
       }

   }

   // 递归分析成两两合并后再合并
   public static void mergeSort(int[] A,int p,int r){

       if(p<r){
           int q = (p + r)/2;
           mergeSort(A,p,q);
           mergeSort(A,q+1,r);
           mergeWithout(A,p,q,r);
       }
   }

    @Override
    public void run(int[] A) {
        mergeSort(A,0,A.length-1);
    }
}
