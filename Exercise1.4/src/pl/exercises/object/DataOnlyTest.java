package pl.exercises.object;

//: Exercise4.java

/**
 * Exercise 4, page 90 of "Everything is an object" chapter
 * Compile and run code from page 70
 *
 * @author Krystian Buszman
 * @version 1.0
 */

public class DataOnlyTest {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;

            void show() {
                System.out.println("int: " + i);
                System.out.println("double: " + d);
                System.out.println("boolean: " + b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        data.show();
    }
}   /* Output
    int: 47
    double: 1.1
    boolean: false
    *///~
