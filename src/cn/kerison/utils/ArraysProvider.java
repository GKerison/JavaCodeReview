package cn.kerison.utils;

import cn.kerison.TestProvider;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.IntConsumer;

/**
 * Created by k on 2016/11/23.
 */
public class ArraysProvider implements TestProvider{

    @Override
    public void test() {
        List list = Arrays.asList("Text", 1, new Date());
        System.out.println(list);

        String[] strs = new String[]{"A", "B", "C"};
        System.out.println( Arrays.toString(strs));
        Object[] deepStrs = new Object[]{"A", "B", "C",strs};
        System.out.println( Arrays.deepToString(deepStrs));

        int item =  11;
        int[] arr = new int[]{0,1, 2,item, 3, 4, 5, 6, 7, 8,9,10};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, item);
        System.out.println(String.format("in %s search %d find at %d",Arrays.toString(arr),item,index));


        int[] data = new int[]{99,1,9,4,6,0};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        int[] srcArr = new int[]{0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(Arrays.copyOf(srcArr,3)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(srcArr,2,4)));

        Arrays.parallelPrefix(srcArr, (left, right) -> left+right);
        System.out.println(Arrays.toString(srcArr));


        Arrays.stream(new int[]{1,2,3,4,5,6}).filter(value -> value <= 3).forEach(value -> System.out.println(value));
        Arrays.spliterator(new int[]{1,2,3,4,5,6}).forEachRemaining((IntConsumer) value -> System.out.println(value));



    }
}
