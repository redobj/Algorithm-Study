package year2018.month01;

import helper.ArrayHelper;
import helper.RunInterface;

/**
 * 每天一个算法学习
 * 简单桶排序
 * BucketSort
 * 2018/01/21
 */
public class BucketSortSimple implements RunInterface {
/**
 * 缺点：消耗空间大
 */


    /**
     * 建立桶
     * @param arr 待排序数组
     * @param max 最大值
     */
    public int[] bucket(int[] arr, int max){
        int[] bucket = new int[max+1];
        for(int i = 0;i < arr.length; i++){
            bucket[arr[i]]++;
        }
        return bucket;
    }

    public void sort(int[] arr){
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            temp = Math.max(temp,arr[i]);
        }

        int[] bucket = bucket(arr,temp);
        int i = 0;
        int j = 0;
        while(i<bucket.length){
            if(bucket[i] == 0){
                i++;
            }
            else {
                arr[j] = i;
                bucket[i]--;
                j++;
            }
        }
    }


    @Override
    public void run(int[] A) {
        sort(A);
    }
}
