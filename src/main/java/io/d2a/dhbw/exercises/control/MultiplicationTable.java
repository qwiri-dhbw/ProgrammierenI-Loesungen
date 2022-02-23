package io.d2a.dhbw.exercises.control;

/*
 * Entwickeln Sie ein Programm MultiplicationTable,
 * welches das kleine Einmaleins in Tabellenform (10x10-Tabelle) ausgibt!
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        // size beinhaltet die groesse der Tabelle; kann dynamisch angepasst werden
        final int size = 10;

        // padding beinhaltet den Abstand der Zahlen in der Tabelle
        final int padding = (int) Math.ceil(Math.log10( size * size )) + 2;

        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= size; k++) {
                System.out.printf("%" + padding + "d", i * k);
            }
            System.out.println();
        }
    }

}