package dat;

import static javax.swing.JOptionPane.showInputDialog;

public class trinnskatt {

	public static void main(String[] args) {
		// TODO lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten. 
		double bruttoinntekt = Double.parseDouble(showInputDialog("Skriv inntekt"));
		double t1 = (bruttoinntekt-180800)* 0.019;
		double t2 = (bruttoinntekt-254500)* 0.042;
		double t3 = (bruttoinntekt-639750)* 0.132;
		double t4 = (bruttoinntekt-999550)* 0.162;
		double A  = (254500-180800)       * 0.019;
		double B  = (639750-254500)       * 0.042;
		double C  = (999550-639750)       * 0.132;

		

 	
		if (bruttoinntekt < 180800) {
			System.out.println("Du betaler ikke trinnskatt!");
		} 
		else if (bruttoinntekt > 180800 && bruttoinntekt < 254500) {
			System.out.println("Du betaler " + t1 + "kr i trinnskatt!");
		} 
		else if (bruttoinntekt > 254500 && bruttoinntekt < 639750) {
			System.out.println("Du betaler " + (t2 + A) + "kr i trinnskatt!");
		}
		else if (bruttoinntekt > 639750 && bruttoinntekt < 999550) {
			System.out.println("Du betaler " + (t3 + A + B) + "kr i trinnskatt!");
		} 
		else if (bruttoinntekt > 999550) {
			System.out.println("Du betaler " + (t4 + A + B + C) + "kr i trinnskatt!");
		}
	}

}
