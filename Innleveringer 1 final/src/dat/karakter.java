package dat;

import static javax.swing.JOptionPane.showInputDialog;

public class karakter {

	public static void main(String[] args) {
		// TODO Lag et program som leser inn en poengsum "heltall". Finn og skriv ut den karakteren A-F dette tilsvarer. 
		double poeng = 0.0;
		poeng = Double.parseDouble(showInputDialog("Skriv inn poengsum du fikk på prøven."));
		if (poeng <=39) {
			System.out.println("Du har fått karakter F. " );
		}
		else if (poeng >= 40 && poeng <=49) {
			System.out.println("Du har fått karakter E. " );
		}
		else if (poeng >= 50 && poeng <=59) {
			System.out.println("Du har fått karakter D. " );
		}
		else if (poeng >= 60 && poeng <=79) {
			System.out.println("Du har fått karakter C. " );
		}
		else if (poeng >= 80 && poeng <=89) {
			System.out.println("Du har fått karakter B. " );
		}
		else if (poeng >= 90 && poeng <=100) {
			System.out.println("Du har fått karakter A. Gratulerer! " );
	}

}}

