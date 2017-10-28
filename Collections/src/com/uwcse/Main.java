package com.uwcse;

import java.util.*;

public class Main {

    public static void findThePrime() {
        /* Linked List -
            A collection that stores a list of elements in small object containers called
            nodes, which are linked together.

            binarySearch(list, value) -
            Searches a sorted list for a given element value and returns its index


         */
        int max = 50;
        List<Integer> primes = new LinkedList<>();
        List<Integer> numbers = new LinkedList<>();
        for(int i = 2; i < max; i++){
            numbers.add(i);
        }

        while (!numbers.isEmpty()) {
            int front = numbers.remove(0);
            primes.add(front);
            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()) {
                int current = itr.next();
                if (current % front == 0) {
                    itr.remove();
                }
            }
        }
        for (Integer i:
                primes) {
            System.out.println(i);
        }
    }

    public static void sets(){
        /* Set -
            A collection that cannot contain duplicates.

         */
    }

    public static void HSetVSTSet(){
        /*
        HashSet -
            1. Extremely fast performance for add, contains, and remove tasks
            2. Can be used with any type of objects as its elements
        Treeset -
            1. Elements are stored in sorted order.
            2. Must be used with elements that can be compared (such as Integer, String)


         */
    }

    public static int totalElements(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        return union.size();
    }

    public static void Map(){
        /*
        Map -
            A collection that associates objects called keys with objects called values.
        clear() -
            Removes all keys and values from a map
        containsKey(key) -
            Returns true if the given key maps to some value in this map
        containsValue(value) -
            Returns true if some key maps to the given value in this map
        get(key) -
            Returns the value associated with this key, or null if not found
        isEmpty() -
            Returns true if this collection contains no keys or values
        keySet() -
            Returns a Set of all keys in this map
        put(key, value) -
            Associates the given key with the given value
        putAll(map) -
            Adds all key/value mappings from the given map to this map
        remove(key) -
            Removes the given key and its associated value from this map
        size() -
            Returns the number of key/value mappings in this map
        values() -
            Returns a Collection of all values in this map

        Map<String, Double> salaryMap = new HashMap<String, Double>();
        salaryMap.put("Stuart Reges", 10000.00);
        salaryMap.put("Marty Stepp", 95500.00);
        salaryMap.put("Jenny", 86753.09);
        salaryMap.containsKey("Stuart Reges"); // 10000.00
         */
    }
    public static boolean contains3(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            String word = i.next();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map.containsValue(3);
    }

    public static void main(String[] args) {
	    List<String> list = new ArrayList<>();
	    list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("hamlet");

	    boolean h = contains3(list);
    }
}
