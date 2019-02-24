package pl.exercises.object;

//: Exercise11.java

/**
 * Exercise 10, page 90 of "Everything is an object" chapter
 * Compiling and run AllTheColorsOfTheRainbow code from page 88
 *
 * @author Krystian Buszman
 * @version 1.0
 */

public class Rainbow {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
        System.out.println("atc.AllTheColorsOfTheRainbow = " + atc.anIntegerRepresentingColors);
        atc.changeColor(3);
        atc.changeTheHueOfTheColor(5);
        System.out.println("After changing");
        System.out.println("anIntegerRepresentingColor = " + atc.anIntegerRepresentingColors);
        System.out.println("hue = " + atc.hue);
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors = 0;
    int hue = 0;
    void changeTheHueOfTheColor (int newHue) {
        hue = newHue;
    }
    int changeColor(int newColor) {
        return anIntegerRepresentingColors = newColor;
    }
}   /* Output
    atc.AllTheColorsOfTheRainbow = 0
    After changing
    anIntegerRepresentingColor = 3
    hue = 5
    *///~
