package dat;

import static javax.swing.JOptionPane.showInputDialog;

public class heltall {

	public static void main(String[] args) {
		// TODO Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n!
		String iTxt= showInputDialog("Gi et heltall!");
		int x = Integer.parseInt(iTxt);
		int resultat=1;
		for (int y =1; y <= x; y++){
			  resultat *=y;
			}
		System.out.println(resultat);
	}

}
