package test;

import helper.ArrayHelper;
import org.junit.Test;
import year2018.month01.*;

public class UnitTest {

    @Test
    public void test(){
        int[] random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new InsertionSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new MergeSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new SelectionSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new BubbleSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new ShellSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new QuickSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new HeapSort(),random);
    }

    @Test
    public void test2(){
        int[] random = ArrayHelper.getRandomInt(100,0,100);
        ArrayHelper.testPerformance(new BucketSortSimple(),random);
    }

    @Test
    public void test3(){
        int[] random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new MergeSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new ShellSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new QuickSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new HeapSort(),random);
        random = ArrayHelper.getRandomInt(100000,0,100000);
        ArrayHelper.testPerformance(new BucketSortSimple(),random);
    }
}
