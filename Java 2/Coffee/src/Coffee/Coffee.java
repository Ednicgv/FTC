package Coffee;
import javax.swing.*;
import java.util.*;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coffee
	{
		public static void main (String args[])
			{
				Scanner scan = new Scanner (System.in);
				double total = 0;
				System.out.println("Jivin' Java Coffee Shop");
				System.out.println("------------------------");
				System.out.println("(1)  American   $1.99");
				System.out.println("(2)  Espresso   $2.50");
				System.out.println("(3)  Latte      $2.15");
				System.out.println();
				System.out.println("Choose 1, 2, or 3, or press 0 to quit: ");
				int selection = scan.nextInt();
					while (selection != 0)
						{
						if (selection == 1)
							total += 1.99;
						else if (selection == 2)
							total += 2.50;
						else if (selection == 3)
							total += 2.15;

						System.out.println("--------------------");
						System.out.println("(1) American 1.99");
						System.out.println("(2) Espresso 2.50");
						System.out.println("(3) Latte 2.15");
						System.out.println();
						System.out.println("Choose 1, 2, or 3, or press 0 to quit: ");
						selection = scan.nextInt();
						}//end while
				
				DecimalFormat df = new DecimalFormat("#.##");
				System.out.println("Your total is $" + df.format(total));
				System.exit(0);
			}//end main
	}//end class Coffee