package coreJava.advanced.iteratorEnumerator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class EnumerationJava {

    // Enumeration is an interface.
    // Introduced for iterating legacy collection objects.
    // Legacy classes v1.0 :  HashTable, Stack, Vector, Dictionary, Properties.
    // Also known as forward directional iterator, and we cannot perform any actions like addition, updation, deletion.

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Fruits");
        v.add("Banana");
        v.add("Cherry");
        v.add("Apple");

        // We know that Enumeration is an interface, for the interface we cannot create objects.
        Enumeration<String> e = v.elements();
        // .hasMoreElements();
        // .hasNextElement();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }


        // Using HashTable

        Hashtable<String, Integer> details = new Hashtable<>();
        details.put("Pramod", 23);
        details.put("Saatvik", 45);
        details.put("Jason", 4);
        details.put("Aaron", 19);

        Enumeration<Integer> enumeration = details.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


        // Properties
        Properties prop = new Properties();
        prop.setProperty("url", "Local Host");
        prop.setProperty("userName", "admin");

        Enumeration<Object> ee = prop.elements();
        while(ee.hasMoreElements()){
            System.out.println(ee.nextElement());
        }



    }
}
