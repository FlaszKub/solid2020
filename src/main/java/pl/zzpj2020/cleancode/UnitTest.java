package pl.zzpj2020.cleancode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;

public class UnitTest {

    @Test
    public void simpleTest() {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(2);
        integerList.add(4);
        integerList.add(3);
        integerList.add(6);
        integerList.add(6);
        integerList.add(2);
        ListStats it = new ListStats(integerList);

        Assert.assertEquals(3.8333, it.getAverage(), 0.001);
        Assert.assertEquals(2, it.getMinValue());
        Assert.assertEquals(6, it.getMaxValue());
        Assert.assertEquals(1, it.getNumberOfOccurrences(4));

    }
}
