package pl.exercises.object;

//: Exercise6.java

/**
 * Exercise 6, page 90 of "Everything is an object" chapter
 * Program includes and calls storage() method
 * Data are printed in main()
 *
 * @author Krystian Buszman
 * @version 1.0
 */

public class StorageTest {
    public static void main(String[] args) {
        class StorageStuff {
            int storage(String s)
            {
                return s.length() * 2;
            }
        }
        StorageStuff x = new StorageStuff();
        System.out.println(x.storage("Storage test"));
    }
}   /* Output
    24
    *///~
