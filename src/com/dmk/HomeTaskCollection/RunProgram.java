package com.dmk.HomeTaskCollection;

import java.util.*;

class RunProgram {
    public static void main(String[] args) {

     //CollectionUtils
        ArrayList<Integer> firstCol = new ArrayList<Integer>();

        firstCol.add(13);
        firstCol.add(25);
        firstCol.add(0);
        firstCol.add(56);
        firstCol.add(25);
        firstCol.add(12);
        firstCol.add(589);

        ArrayList<Integer> secondCol = new ArrayList<Integer>();

        secondCol.add(13);
        secondCol.add(13);
        secondCol.add(0);
        secondCol.add(56);
        secondCol.add(11);
        secondCol.add(12);
        secondCol.add(14);
        secondCol.add(166667);
        secondCol.add(134347);

        ImplCollectionUtils run = new ImplCollectionUtils();
        try {


            System.out.println("Совмещает две целочисленных коллекции в одну : " + run.union(firstCol, secondCol));


            System.out.println("Cоздание коллекции, содержащей одинаковые значения двух коллекций аргументов: " + run.intersection(firstCol, secondCol));


            System.out.println("Объеденяет две коллекции. Не содержит дубликатов: " + run.unionWithoutDuplicates(firstCol, secondCol));

            System.out.println("Содержит одинаковые элементы из коллекций аргументов. Не содержит дубликатов: " + run.intersectionWithoutDuplicates(firstCol, secondCol));

            System.out.println("Содержит различные значиения из двух коллекций (сравнивает по индексу): " + run.difference(firstCol, secondCol));



            NullPointerException excp = new NullPointerException("Oshibka");

        }catch (NullPointerException excp) {
            System.out.println("Не может быть пустых элементов");
        }


        System.out.println();


        // implements ListUtils
        ImplListUtils runList = new ImplListUtils();
        System.out.println("Возвращает список Т элементов: " + runList.asList("I", "love", "JAVA", "evry", "day"));

        System.out.println("Сортирует по убыванию (implements sortedList)  " + runList.sortedList(firstCol));

        System.out.println();

        //SetUtils
        ArrayList<Integer> integ = new ArrayList<>();
        Set<String> stri = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o2.compareTo(o1)<=0){
                    return 1;
                }
                 else{
                    return 1;
                }
            }
        });

        integ.add(1);   stri.add("c");
        integ.add(7);   stri.add("a");
        integ.add(4);   stri.add("b");
        integ.add(9);   stri.add("z");
        integ.add(29);  stri.add("e");
        integ.add(29);  stri.add("x");

        ImplSetUtils runSetUtils = new ImplSetUtils();

        System.out.println("Сортирует элементы String в соответствии с элементами Integer: " + runSetUtils.orderedSet(integ, stri));




    }
}
