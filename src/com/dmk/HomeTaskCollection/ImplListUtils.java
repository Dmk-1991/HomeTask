package com.dmk.HomeTaskCollection;

import com.sourceit.hometask.collections.CollectionUtils;
import com.sourceit.hometask.collections.ListUtils;

import java.util.*;

//Возвращает список Т элементов
public class ImplListUtils implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        LinkedList<String> resultAsList = new LinkedList<String>();

        for(String i: strings) {
            resultAsList.offer(i);
        }

        return resultAsList;
    }


    @Override
    public <T extends Comparable<T>> List<T> sortedList( List<T> ts) throws IllegalArgumentException {

        final Map<Integer,T> tsMap = new TreeMap<>();
        for(Integer i=0; i<ts.size();i++){
            tsMap.put(i, ts.get(i));
        }

        Map<Integer, T> sortedMap = new TreeMap<Integer, T>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = tsMap.get(o2).compareTo(tsMap.get(o1));
                return result == 0 ? -1 : result;
            }
        });
        sortedMap.putAll(tsMap);
        ArrayList<T> resultList = new ArrayList<T>(sortedMap.values());
        return resultList;
    }
}


