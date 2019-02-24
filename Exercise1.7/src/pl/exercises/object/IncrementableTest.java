package pl.exercises.object;

//: Exercise7.java

/**
 * Exercise 7, page 90 of "Everything is an object" chapter
 * Turn the Incrementable code from page 77 into a working program
 *
 * @author Krystian Buszman
 * @version 1.0
 */

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}

public class IncrementableTest {
    public static void main(String[] args) {
        System.out.println("StaticTest.i = " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        System.out.println("st1.i = " + st1.i);
        StaticTest st2 = new StaticTest();
        System.out.println("st2.i = " + st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("StaticTest.i after increment = " + StaticTest.i);
        System.out.println("st1.i after increment = " + st1.i);
        System.out.println("st2.i after increment = " + st2.i);
    }
}   /* Output
    StaticTest.i = 47
    st1.i = 47
    st2.i = 47
    StaticTest.i after increment = 48
    st1.i after increment = 48
    st2.i after increment = 48
    *///~
