package pl.exercises.object;

//: Exercise5.java

/**
 * Exercise 5, page 90 of "Everything is an object" chapter
 * Modify code from previous exercise
 * Data are printed in main()
 *
 * @author Krystian Buszman
 * @version 1.0
 */

public class DataOnlyTest2 {
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
        data.i = 12;
        data.d = 1.234567;
        data.b = true;
        data.show();
    }
}   /* Output
    int: 12
    double: 1.234567
    boolean: true
    *///~
