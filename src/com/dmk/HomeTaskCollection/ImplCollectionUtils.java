package com.dmk.HomeTaskCollection;

import com.sourceit.hometask.collections.CollectionUtils;

import java.util.*;


 public class ImplCollectionUtils implements CollectionUtils {

    @Override
    //объеденяет две коллекции
    public Collection<Integer> union(Collection<Integer> integers, Collection<Integer> integers2) throws NullPointerException {

        ArrayList<Integer> resultUnion = new ArrayList<Integer>(integers);
        resultUnion.addAll(resultUnion.size(), integers2);

        return resultUnion;


    }


    @Override
    //создание новой коллекции, которая содержит одинаковые значения из двух коллекций аргументов
    public Collection<Integer> intersection(Collection<Integer> integers, Collection<Integer> integers2) throws NullPointerException {
        if (integers == null || integers2 == null) {
            throw new NullPointerException("Oshibka");
        }
        ArrayList<Integer> resultIntersection = new ArrayList<Integer>();

        for (int i : integers) {
            if (integers2.contains(i)) {
                resultIntersection.add(i);
            }
        }
        return resultIntersection;
    }

    @Override
    //объеденяет две коллекции. Не содержит дубликатов.
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> integers, Collection<Integer> integers2) throws NullPointerException {
        if (integers == null || integers2 == null) {
            throw new NullPointerException("Oshibka");
        }
        HashSet<Integer> resultUnionWithOutDuplicates = new HashSet<Integer>(integers);
        resultUnionWithOutDuplicates.addAll(integers2);

        return resultUnionWithOutDuplicates;


    }
    //Содержит одинаковые элементы из коллекций аргументов. Не содержит дубликатов
    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> integers, Collection<Integer> integers2) throws NullPointerException {
        HashSet<Integer> resultIntersectionWithOutDuplicates = new HashSet<Integer>();

        for (int i : integers) {
            if (integers2.contains(i)) {
                resultIntersectionWithOutDuplicates.add(i);
            }
        }
        return resultIntersectionWithOutDuplicates;
    }

    //Содержит различные значиения из двух коллекций (сравнивает по индексу):
     @Override
    public Collection<Integer> difference(Collection<Integer> integers, Collection<Integer> integers2) throws NullPointerException {
        ArrayList<Integer> col1 = new ArrayList<Integer>(integers);
        ArrayList<Integer> col2 = new ArrayList<Integer>(integers2);

        ArrayList<Integer> resultDifference = new ArrayList<Integer>();

        int i = 0;
        if (col1.size() > col2.size()) {


            while (i < (col2.size())) {
                if (col1.get(i) != col2.get(i)) {
                    resultDifference.add(col1.get(i));
                    resultDifference.add(col2.get(i));
                }
                i++;
            }
            resultDifference.addAll( col1.subList(col2.size(), col1.size() ));
        }
        else{
            while (i < (col1.size())) {
                if (col1.get(i) != col2.get(i)) {
                    resultDifference.add(col1.get(i));
                    resultDifference.add(col2.get(i));
                }
                i++;
            }
            resultDifference.addAll( col2.subList(col1.size(), col2.size() ));


        }
        return resultDifference;
    }
}
