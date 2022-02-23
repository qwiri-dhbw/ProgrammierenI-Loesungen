package io.d2a.dhbw.exercises.datatypes;

public class Round {

    private static int round(double input) {
        return (int) (input + .5);
    }

    private static int roundSignAware(double input) {
        return (int) (input + 0.5 * (input < 0 ? -1 : 1));
    }

    public static void main(String[] args) {
        double pi = 3.1415926; // Naeherung der Kreiszahl Pi
        double e = 2.7182818; // Naeherung der Eulerschen Zahl e
        System.out.println("Pi ganzzahlig: " + round(pi));
        System.out.println("e ganzzahlig: " + round(e));
        System.out.println("Pi ganzzahlig: " + round(-pi));
        System.out.println("e ganzzahlig: " + round(-e));
        System.out.println("Pi ganzzahlig: " + roundSignAware(pi));
        System.out.println("e ganzzahlig: " + roundSignAware(e));
        System.out.println("Pi ganzzahlig: " + roundSignAware(-pi));
        System.out.println("e ganzzahlig: " + roundSignAware(-e));
    }

}
