package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.List;

public class PTestImpl {
    public static String last(List<String>list){
        int index = list.size();
        return list.get(index-1);
    }

    public static int lenght(List<Integer> integers) {
        return integers.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = numbers.size()-1; i>=0;i--){
            resultList.add(numbers.get(i));
        }
        return resultList;
    }
}
