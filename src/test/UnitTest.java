package test;

import helper.ArrayHelper;
import org.junit.Test;
import year2018.month01.InsertionSort;
import year2018.month01.MergeSort;
import year2018.month01.SelectionSort;

public class UnitTest {

    @Test
    public void test(){
        int[] random = ArrayHelper.getRandomInt(1000000,0,100000);
        ArrayHelper.testPerformance(new InsertionSort(),random);
        ArrayHelper.testPerformance(new MergeSort(),random);
        ArrayHelper.testPerformance(new SelectionSort(),random);
    }
}
