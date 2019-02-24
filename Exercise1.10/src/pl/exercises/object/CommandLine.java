package pl.exercises.object;

//: Exercise10.java

/**
 * Exercise 10, page 90 of "Everything is an object" chapter
 * Printing three arguments taken from the command line
 * By indexing into command line array off strings
 *
 * @author Krystian Buszman
 * @version 1.0
 */

public class CommandLine {
    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "abc";
        s[1] = "def";
        s[2] = "ghi";

        System.out.println("s[0]: " + s[0]);
        System.out.println("s[1]: " + s[1]);
        System.out.println("s[2]: " + s[2]);
    }
}   /* Output
    s[0]: abc
    s[1]: def
    s[2]: ghi
    *///~