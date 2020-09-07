package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave8 
{

	public static void main(String[] args) 
	{
		int y;
		
		y = parseInt (showInputDialog ("Tast inn faktulitet (!):"));
		long sum = 1;
		
		while (y <=0)
		{
			showMessageDialog (null, "Tast større en 0, og positivt tall \n"
							  	+"\n"
								+"Tast enter for å fortsette");	
		y = parseInt (showInputDialog ("Tast inn faktulitet (!):"));
		}
		
		if (y > 0)
		{
			for (int i = 1; i <= y; i++) 
			{
                sum *= i;
            }
			showMessageDialog (null, y+"! = "+sum);
		}
		else 	
		{
				showMessageDialog (null, "Tast positivt tall");	
		}
	}

}
