package com.sdabyd2.programowanie;

import java.util.*;
import java.util.stream.Collectors;

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
            //Collection.riverse;
        }
        return resultList;
    }

    public static boolean isPalindrome(List<String> strings) {
        List<String> resultList = new ArrayList<String>();
        for (int i = strings.size()-1; i>=0;i--){
            resultList.add(strings.get(i));
        }
        boolean result = false;
        if (strings.equals(resultList)){
            result = true;
        }return result;
    }

    public static Object[] removeAt(List<String> strings, int i) {
        List<String> stringsTwo = new ArrayList<String>(strings);
        stringsTwo.remove(i-1);
        Object[] arrayResult = {stringsTwo,strings.get(i-1)};
        return arrayResult;
    }

    public static List<String> randomSelect(List<String> strings, int i) {
        int sizeOfList = strings.size()-1;
        Random drawElements = new Random(System.currentTimeMillis()); //seed podawany jako czas aktualny
        List<String> listOfResults = new ArrayList<String>();
        int j = 1;
        do {
            listOfResults.add(strings.get(drawElements.nextInt(sizeOfList)));
            j++;
        }while (j<=i);
        return listOfResults;
    }
/*
    public static List<String> flatten(List<Object> objects) {
        // asList("a", asList("b", asList("c", "d")), "e"));
        List<String> listOfResult = new ArrayList<String>();

        for(int i = 0; i<objects.size();i++) {
            if (objects.get(i).getClass().isInstance(String.class)){
                listOfResult.add((String)objects.get(i));
            }else {
                List<Object> shortList = (List<Object>) objects.get(i);
                for (int j =0; j<shortList.size(); j++){
                    if (shortList.get(j).getClass().isInstance(String.class)){
                        listOfResult.add((String)shortList.get(j));
                    }else {
                        List<String> shorterList = (List<String>)shortList.get(j);
                        for (int k = 0; k<shorterList.size(); k++){
                            listOfResult.add(shorterList.get(k));
                        }
                    }
                }
            }
        }return listOfResult;
    }MARCINA:
    public static List<String> flatten(List<Object> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof String){
                result.add((String) list.get(i));
            } else {
                List<Object> innerList = (List<Object>) list.get(i);
                for (int j = 0; j < innerList.size(); j++) {
                    if (innerList.get(j) instanceof String) {
                        result.add((String) innerList.get(j));
                    } else {
                        List<String> innestList = (List<String>) innerList.get(j);
                        for (int k = 0; k < innestList.size(); k++) {
                            if (innestList.get(k) instanceof String) {
                                result.add((String) innestList.get(k));
*/
    public static List<String> compress(List<String> strings) {
        Set<String>shortList = new HashSet<String>(strings);
        List<String>resultList = new ArrayList<String>(shortList);
        return resultList;
    }

    public static List<String> duplicate(List<String> strings) {
        List<String> resultList = new ArrayList<>();
        for (int i =0; i<strings.size();i++){
            resultList.add(strings.get(i));
            resultList.add(strings.get(i));
        }
        return resultList;
    }
    public static List<String> duplicateWithParameter(List<String> strings, int i) {
        List<String> resultList = new ArrayList<>();
        for (int j = 0; j<strings.size(); j++){
            int k =1;
            while (k<=i){
                resultList.add(strings.get(j));
                k++;
            }
        }return resultList;
    }
/*
    public static List<String> dropEveryNth(List<String> strings, int i) {
        List<String>cloneOfStrings = new ArrayList<>();
        for (int j =2; j<strings.size(); j+=i){
            cloneOfStrings.add(strings.get(j));
        }
    }*/


}
