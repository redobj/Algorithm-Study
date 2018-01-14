package year2018.month01;

/**
 * 每天一个经典算法学习
 * 插入排序
 * insertionSort
 * 2018/01/15
 */
public class InsertionSort {
    public static void main(String[] args) {
        // 待排序数组
        int[] nums = {99,98,20,10,56};
        // j 指出正在插入到手中的"当前牌"
        /**
         * for 表示迭代开始
         * 包含 nums[0..j-1] 表示手中已排好序的牌
         * 及 nums[j+1..length-1] 表示桌面上的牌堆
         * j 指示正在插入到手中的"当前牌" 从第二张牌即98开始
         *
         */
        for(int j = 1;j<nums.length;j++){
            // 当前牌的值
            int key = nums[j];
            // 指示 j-1 [0..j-1]表示已排好序的牌
            int i = j-1;
            /**
             * 迭代比对[j-1..0]
             * 知道比对到小于key的值或比对到第一张牌
             */
            while(i>=0 && nums[i]>key){
                //把大于key的数值后移一位
                nums[i+1] = nums[i];
                i = i-1;
            }
            // i+1 指示 key 插入的正确位置
            nums[i+1] = key;
        }

        for (int k :
                nums) {
            System.out.print(k+" ");
        }


        int[] nums2 = {31,59,41,26,41,58};
//        ---------------------------------------------
        //反向实现
        System.out.println();
        System.out.println("反向实现");

        for (int i = 1; i < nums2.length; i++) {
            int key = nums2[i];
            int j = i-1;
            while(j>=0 && nums2[j]<key){
                nums2[j+1] = nums2[j];
                j--;
            }
            nums2[j+1] = key;
        }

        for (int k :
                nums2) {
            System.out.print(k+" ");
        }
    }
}
