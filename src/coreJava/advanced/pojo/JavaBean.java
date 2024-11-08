package coreJava.advanced.pojo;

public class JavaBean {

    /*
        Java Bean Class: Extended version of a Pojo Class. (Subset of POJO).
        Also referred as serializable Pojo Class.

        Rules for a class to be called as Java Beans Class.
            1. It should implement "Serializable" interface.
            2. It should have No-Args constructor.
            3. All the properties (instance variables) must be private.
            4. It should have getters and setters (public) in order to access the properties.

        POJO and Java Beans are almost same.
        POJO can be used in our regular programs, specifically for API Automation.

        Why do we need Java Beans then?
            - In Java Beans, we implement Serializable.
            - When you want to store Java Object (Application Layer) into a Database layer through network, we have to use Serialize to send it in stream form.
            - Object from application layer will be Serialized and then stored in a database.
            - When you want that object from database, we need to de-serialize and get it.
    */


}
