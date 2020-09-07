package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave7 {

	public static void main(String[] args) {
		
		int s;
		
		for (int i=1; i<=10; i++) 
		{
		s = parseInt (showInputDialog ("Tast inn karakter score \n Gyldig verdi 0 - 100"));
				
				while ( s<0 || s > 100)
				{
					showMessageDialog (null, "Feilmelding: Ugylidg verdi! \n"
										   + "\n"
										   + "Tast enter for å komme videre \n"
										   + "\n"
										   + "(Husk at kun 0 - 100 er gyldige verdier)");
					s = parseInt (showInputDialog ("Tast inn karakter score \n Gyldig verdi 0 - 100"));
				}
				if (s<=100 && s>=90) 
				{
					showMessageDialog (null, "Karakter A");
				}
				else if (s<=89 && s>=80) 
				{
					showMessageDialog (null, "Karakter B");
				}
				else if (s<=79 && s>=60)
				{
					showMessageDialog (null, "Karakter C");
				}
				else if (s<=59 && s >=50)
				{
					showMessageDialog (null, "Karakter D");
				}
				else if (s<=49 && s >=40)
				{
					showMessageDialog (null, "Karakter E");
				}
				else if (s<=39 && s>=0)
				{
					showMessageDialog (null, "Karakter F");
				}
		}
		

			
	}
}
