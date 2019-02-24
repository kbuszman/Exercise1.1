package pl.exercises.object;

//: Exercise9.java

/**
 * Exercise 9, page 90 of "Everything is an object" chapter
 * Demonstrating autoboxing for all primitive types
 * from page 65 and their wrappers
 *
 * @author Krystian Buszman
 * @version 1.0
 */

public class Autoboxing {
    public static void main(String[] args) {
        boolean b = false;
        char c = 'x';
        byte by = 2;
        short sh = 4;
        int i = 8;
        long l = 16;
        float f = .32f;
        double d = .64;
        Boolean B = b;
        Character C = c;
        Byte By = by;
        Short Sh = sh;
        Integer I = i;
        Long L = l;
        Float F = f;
        Double D = d;
        System.out.println("boolean: " + b + ", Boolean: " + B);
        System.out.println("char: " + c + ", Character: " + C);
        System.out.println("byte: " + by + ", Byte: " + By);
        System.out.println("short: " + sh + ", Short: " + Sh);
        System.out.println("int: " + i + ", Integer: " + I);
        System.out.println("long: " + l + ", Long: " + L);
        System.out.println("float: " + f + ", Float: " + F);
        System.out.println("double: " + d + ", Double: " + D);
    }
}   /* Output
    boolean: false, Boolean: false
    char: x, Character: x
    byte: 2, Byte: 2
    short: 4, Short: 4
    int: 8, Integer: 8
    long: 16, Long: 16
    float: 0.32, Float: 0.32
    double: 0.64, Double: 0.64
    *///~
