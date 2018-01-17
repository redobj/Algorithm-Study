package helper;

import java.util.Random;

/**
 * 数组相关的辅助类
 */
public class ArrayHelper {

    /**
     * 随机生成数组
     * @param size 数组数量
     * @param rangeL 数组范围
     * @param rangeR
     * @return
     */
    public static int[] getRandomInt(int size,int rangeL,int rangeR){
        int[] temp = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            temp[i] = random.nextInt(rangeR) % (rangeR-rangeL+1) + rangeL;
        }
        return temp;
    }

    /**
     * 打印数组
     * @param printArr
     */
    public static void printArray(int[] printArr){
        for (Object o:printArr
             ) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    /**
     * 测试运行性能
     * @param run
     * @param A
     */
    public static void testPerformance(RunInterface run,int[] A){
        Long begin = System.currentTimeMillis();
        run.run(A);
        Long end = System.currentTimeMillis();

        System.out.println(run.getClass().getSimpleName()+" 用时：" + (end-begin) + " ms");
        if(isSorted(A)){
            System.out.println("排序成功");
        }else{
            System.out.println("排序失败");
        }
        System.out.println();
    }

    /**
     * 检查是否排序
     */
    public static boolean isSorted (int[] A){
        for(int i = 0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                return false;
            }
        }
        return true;
    }

}
