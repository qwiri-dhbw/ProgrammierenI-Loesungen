package io.d2a.dhbw.exercises.control;

/*
 * Der Wildbestand eines Forstes umfasst zu Beginn 200 Hirsche.
 * Klasse: Deers
 *
 * Die jährliche Vermehrung beträgt 10 % des Jahresanfangsbestands;
 * im Herbst werden 15 Stück zum Abschuss freigegeben.
 *
 * Wie entwickelt sich der Bestand in den nächsten Jahren?
 * Erstellen Sie ein Programm Deers, das den jährlichen Wildbestand ermittelt und ausgibt,
 * bis dieser mindestens die Zahl 300 erreicht hat!
 */
public class Deers {

    public static void main(String[] args) {
        int deers = 200;

        for (int year = 1; ; year++) {
            deers *= 1.1;
            deers -= 15;

            System.out.println("Nach Jahr " + year + " gibt's schon " + deers + " Viecher");
            if (deers > 300) {
                break;
            }
        }
    }

}