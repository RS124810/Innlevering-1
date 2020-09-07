package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg6 {
	
	public static void main(String[] args) {
		
		String inntekt = showInputDialog("Tast inn brutto lønn");
			int I = parseInt (inntekt);
			int brutto = I;
			
			// Skatteklasse 0
			if (I <= 164100) {
				showMessageDialog(null, "Brutto lønn kr "+ brutto +"\n"+"Frikort 0% skatt");
			}
			// Skatteklasse 1
			else if (I > 164100 && I <=230950) { I=(I*93)/10000;
			showMessageDialog(null, "Brutto lønn på kr "+ brutto +" gir skatteklasse 1" +"\n" +"0,93% skatt" + "\n" +"kr "+I+" i skatt" );
				// I til  skatt 0.93+ print 
			}
			else if (I > 230950 && I <=580650) { I=(I*241)/10000;
			showMessageDialog(null, "Brutto lønn på kr "+ brutto +" gir skatteklasse 2" +"\n" +"2,41% skatt" + "\n" +"kr "+I+" i skatt" );
			}
			else if (I > 580650 && I <=934050) { I=(I*1152)/10000;
			showMessageDialog(null, "Brutto lønn på kr "+ brutto +" gir skatteklasse 3" +"\n" +"11,52% skatt" + "\n" +"kr "+I+" i skatt" );
			}
			else if (I > 934050 ) { I=(I*1452)/10000;
			showMessageDialog(null, "Brutto lønn på kr "+ brutto +" gir skatteklasse 4" +"\n" +"14,52% skatt" + "\n" +"kr "+I+" i skatt" );
			}
	}
}
