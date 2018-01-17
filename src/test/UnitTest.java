package test;

import helper.ArrayHelper;
import org.junit.Test;
import year2018.month01.BubbleSort;
import year2018.month01.InsertionSort;
import year2018.month01.MergeSort;
import year2018.month01.SelectionSort;

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
    }
}
