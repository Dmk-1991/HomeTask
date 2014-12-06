package com.dmk.HomeTaskCollection;

import com.sourceit.hometask.collections.SetUtils;

import java.util.*;


public class ImplSetUtils implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> integers, Set<String> strings) throws NullPointerException {
        ArrayList<Integer> coll = new ArrayList<>(integers);

        String[] arr = strings.toArray(new String[strings.size()]);
        final Map<String, Integer> map = new TreeMap();
        for (int i=0; i< coll.size();i++){

            map.put(arr[i], coll.get(i));
        }

        System.out.println(map);

        SortedSet<String>  sorS = new TreeSet<String>( new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = map.get(o1).compareTo(map.get(o2));
                return result == 0 ? -1 : result;

            }
        });

        sorS.addAll(strings);

        return sorS ;
    }






    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException {
        return null;
    }
}
