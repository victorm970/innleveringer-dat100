package dat;

import static javax.swing.JOptionPane.*;

public class karakter {

	public static void main(String[] args) {
		// TODO Utvid programmet i pkt. a) slik at det kan lese inn poengsummer fra 10 studenter og skrive ut karakteren (eller feilmelding) etter hver innlesing.

        for (int antallS = 1; antallS <=10; antallS++) {
            int poeng = 0;

            poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum du fikk p� pr�ven."));
        if (poeng <=39) {
            System.out.println("Du har f�tt karakter F. " );
        }
        else if (poeng >= 40 && poeng <=49) {
            System.out.println("Du har f�tt karakter E. " );
        }
        else if (poeng >= 50 && poeng <=59) {
            System.out.println("Du har f�tt karakter D. " );
        }
        else if (poeng >= 60 && poeng <=79) {
            System.out.println("Du har f�tt karakter C. " );
        }
        else if (poeng >= 80 && poeng <=89) {
            System.out.println("Du har f�tt karakter B. " );
        }
        else if (poeng >= 90 && poeng <=100) {
            System.out.println("Du har f�tt karakter A. Gratulerer! " );
        }
        else {
            System.out.println("Ugyldig poengsum!" );
        }

     
        }
	}
}