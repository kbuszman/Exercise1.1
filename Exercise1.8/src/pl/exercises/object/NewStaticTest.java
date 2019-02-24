package pl.exercises.object;

//: Exercise8.java

/**
 * Exercise 8, page 90 of "Everything is an object" chapter
 * Demonstration result of static word
 * Creation many objects  of particular class
 * One instance of particular static field in that class
 *
 * @author Krystian Buszman
 * @version 1.0
 */

class ExampleClass{
    static double d = 1.23;
    static int i = 3;
    static String s = "t";
}

class Decrement {
    static void decrementD() {
        ExampleClass.d--;
    }
    static void decrementI() {
        ExampleClass.i--;
    }
}

class AddChar {
    static void addChar() {
        ExampleClass.s = ExampleClass.s + "t";
    }
}

public class NewStaticTest {
    public static void main(String[] args) {
        System.out.println("d before decrement: " + ExampleClass.d);
        System.out.println("i before decrement: " + ExampleClass.i);
        System.out.println("s before add char: " + ExampleClass.s);
        ExampleClass ec1 = new ExampleClass();
        ExampleClass ec2 = new ExampleClass();
        Decrement decI = new Decrement();
        decI.decrementI();
        System.out.println("ec1.d after decrement int: " + ec1.d);
        System.out.println("ec1.i after decrement int: " + ec1.i);
        System.out.println("ec1.s after decrement int: " + ec1.s);
        System.out.println("ec2.d after decrement int: " + ec2.d);
        System.out.println("ec2.i after decrement int: " + ec2.i);
        System.out.println("ec2.s after decrement int: " + ec2.s);
        Decrement decD = new Decrement();
        decD.decrementD();
        System.out.println("ec1.d after decrement double: " + ec1.d);
        System.out.println("ec1.i after decrement double: " + ec1.i);
        System.out.println("ec1.s after decrement double: " + ec1.s);
        System.out.println("ec2.d after decrement double: " + ec2.d);
        System.out.println("ec2.i after decrement double: " + ec2.i);
        System.out.println("ec2.s after decrement double: " + ec2.s);
        AddChar adc = new AddChar();
        adc.addChar();
        System.out.println("ec1.d after add char: " + ec1.d);
        System.out.println("ec1.i after add char: " + ec1.i);
        System.out.println("ec1.s after add char: " + ec1.s);
        System.out.println("ec2.d after add char: " + ec2.d);
        System.out.println("ec2.i after add char: " + ec2.i);
        System.out.println("ec2.s after add char: " + ec2.s);
    }
}   /* Output
    d before decrement: 1.23
    i before decrement: 3
    s before add char: t
    ec1.d after decrement int: 1.23
    ec1.i after decrement int: 2
    ec1.s after decrement int: t
    ec2.d after decrement int: 1.23
    ec2.i after decrement int: 2
    ec2.s after decrement int: t
    ec1.d after decrement double: 0.22999999999999998
    ec1.i after decrement double: 2
    ec1.s after decrement double: t
    ec2.d after decrement double: 0.22999999999999998
    ec2.i after decrement double: 2
    ec2.s after decrement double: t
    ec1.d after add char: 0.22999999999999998
    ec1.i after add char: 2
    ec1.s after add char: tt
    ec2.d after add char: 0.22999999999999998
    ec2.i after add char: 2
    ec2.s after add char: tt
    *///~
