package pl.exercises.object;

//: Exercise 13.java

/**
 * Exercise 13.2, page 90 of "Everything is an object" chapter
 * Run Documentation2.java through Javadoc
 * Verify the resulting documentation with your web browser
 *
 * <pre>
 * System.out.println(new Date());
 * </pre>
 *
 * @author Krystian Buszman
 * @version 1.0
 */

import java.util.Date;

public class Documentation2 {
    Date d = new Date();
    void showDate() {
        System.out.println("Actual date is " + d);
    }

    public static void main(String[] args) {
        Documentation2 d2 = new Documentation2();
        d2.showDate();
    }
}///:~
