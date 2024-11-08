package coreJava.advanced.collections;

import javax.swing.*;
import java.util.*;

public class MapJava {
    /*
        Map: Map is an interface provided by the collections framework.

        Hierarchy of Map Interface in Java

                        Map<interface>
                          implements

    HashTable<class>    HashMap<class>          SortedMap<interface>
                          extends                  extends
                        LinkedHashMap<class>    NavigableMap<interface>
                                                implements
                                               TreeMap<class>


        Map is s set of Key and Value pair.

    */

    public static void main(String[] args) {

                  // Creation of Map: HashMap, LinkedHashMap, TreeMap, HashTable

        // HashMap
       // Map<Integer, String> m = new HashMap<>();

        // LinkedHashMap
       // Map<Integer, String> m = new LinkedHashMap<>();

        // TreeMap
        Map<Integer, String> m = new TreeMap<>();

        // HashTable
       // Map<Integer,String> m = new Hashtable<>();



        // Addition of elements in to the Map.
        m.put(101, "Pramod");
        m.put(102, "Saatvik");
        m.put(103, "Aaron");
        m.put(104, "John");

        // Retrieval of keys using "Key Set". Here, we have only keys.
        Set<Integer> Keys = m.keySet();
        for(Integer key: m.keySet()){
            System.out.println(key);
        }

        // Retrieval of keys using "Entry Set". Here, we have all the entries
        Set<Map.Entry<Integer, String>> entries = m.entrySet();
        for(Map.Entry<Integer,String> entry: entries){
            Integer key = entry.getKey();
            String val = entry.getValue();
        }

        System.out.println();

        // Retrieval of values
        Collection<String> vals = m.values();
        for(String val: vals){
            System.out.println(val);
        }

        // Retrieval of values based on a key
        System.out.println(m.get(102));

        // All keys and values
        for(Integer k: Keys ){
            System.out.println(k + ">>>>>" + m.get(k));
        }

        // Deletion of elements
        System.out.println(m);
        System.out.println(m.remove(102));
        System.out.println(m);

        // Verification of Keys
        System.out.println(m.containsKey(102));

        // Verification of Values
        System.out.println(m.containsValue("Pramod"));

        // Update: We have to change the key/value using put.
        System.out.println(m);
        System.out.println(m.put(102, "mod"));
        System.out.println(m);

        // Check and put if key value is not available.
        System.out.println(m.putIfAbsent(109, "Heilas"));
        System.out.println(m);

        // To know how many elements are present in a Map.
        System.out.println(m.size());

        // To delete elements
        m.clear();
    }



}
