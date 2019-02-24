package pl.exercises.object;

//: Exercise1.java

/** Exercise 1, page 89 of "Everything is an object" chapter
 * Displays two variables: int i and char c in terminal
 * @author Krystian Buszman
 * @version 1.0
 */

public class Exercise1 {
    /** Printing variables on terminal without initialization
     * @param args array of string arguments
     * @throws exception No exception thrown
     */
    static int i;
    static char c;
    public static void main(String[] args) {
        System.out.println("int: " + i);
        System.out.println("char: " + c);
    }
}   /* Output:
int: 0
char:
*///~
