package coreJava.advanced.garbageCollection;

public class GarbageCollection {

    /*
    * Garbage Collection is a process of removing unwanted, unused, un referenced anonymous objects from heap to free up the memory.
    * To use memory efficiently.
    * In C programming, we use free to call Garbage collector.
    * In C++, we use Delete ro call Garbage collector.
    * It's a manual process in C and C++ to call Garbage collection.
    * In Java, we can perform Garbage collection manually and automatically.
    * Garbage collection is in Execution engine of JVM architecture.
    * Garbage collection happens only in Heap and Metaspace area.
    * World Stop Events: The scenario where the garbage collector stops execution for some time to collect the garbage.
    * In Java, garbage collection is generation based. Young Generation and old generation to retain the performance.
    * Young Generation is divided into three parts, namely, Eden Space, Survivor S0 (From Space) and Survivor S1(To Space).
    * Garbage Collection is an activity, while Garbage collector is a tool.
    * Garbage collector follows sequence of steps, when the Eden space is full of objects,
    * 1. Mark(marks unreferenced, anonymous),
    * 2. Sweep(removes them) and
    * 3. Compact(arrange them in an order).
    * After this, unused objects will be removed and objects which are useful will be sent to S0(From Space)
    * When Eden space collects new objects, Garbage collector will perform Minor Garbage Collection like above. But this time, Collector will remove unused objects from both Eden space and S0 (From Space) and compact left over(useful) objects in To Space S1.
    * In Young Generation, any one from S0 and S1 will be always empty.
    * In Young Generation, minor garbage collection is performed 15 times by Java.
    * The active objects which are alive (still used) even after 15 times of minor garbage collection will be sent to Old Generation.
    * In Old generation, Garbage collection will be performed, but not frequently. This is called Major Garbage collection.
    * To perform Garbage collection manually, we use
    *   1. System.gc(); or
    *   2. Runtime.getRuntime.gc();
    * While performing manual garbage collection using any of the above two steps, if you want to add additional changes, we have to use finalize method.
    */

    public static void main(String[] args) {

        // Un used objects
        // Un referenced objects
        // Anonymous objects

        GarbageCollection gb1 = new GarbageCollection();
        GarbageCollection gb2 = new GarbageCollection();
        GarbageCollection gb3 = new GarbageCollection();

        // Un referenced
        new GarbageCollection();

        // gb1 object will be un used
        gb1 = null;


        gb2 = gb3;

        System.gc();


    }
}
