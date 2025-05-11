/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author William Van Uitert
 * @version 08/16/2024
 */

public class CurrencyV1
{
    public static void main(String [ ] args)
    {

        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		                               // starting USD

        double pesosSpent = 6433.605;                                          // Mexican Pesos spent
        double pesoExchangeRate = 18.68391;                                    // 1 USD = 18.68391 Pesos
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;           // USD spent in Mexico
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;  // USD remaining after Mexico

		double rupeesSpent = 22122.052;                                        // Indian Rupees spent
		double rupeeExchnageRate = 83.94004;                                   // 1 USD = 83.94004 Ruppees
		double dollarsSpentInIndia = rupeesSpent / rupeeExchnageRate;          // USD spent in India
		double dollarsAfterIndia = dollarsAfterMexico - dollarsSpentInIndia;   // USD remaining after India

		double eurosSpent = 756.3495;                                          // European Euros spent
		double euroExchangeRate = 0.909646;		                               // 1 USD = 0.909646 Euros
		double dollarsSpentInEurope = eurosSpent / euroExchangeRate;           // USD spent in Europe
		double dollarsAfterEurope = dollarsAfterIndia - dollarsSpentInEurope;  // USD remaining after Europe

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion

		// print out the name of the country, the amount of money spent in local currency and USD, and the amount remaining
		System.out.println("Mexico:");
		System.out.print("\tPesos spent:");
		System.out.println("\t\t" + pesosSpent);
		System.out.print("\tUSD equivalent:");
		System.out.println("\t\t" + dollarsSpentInMexico);
		System.out.print("\tUSD remaining:");
		System.out.println("\t\t" + dollarsAfterMexico);
		System.out.println();

		System.out.println("India:");
		System.out.print("\tRupees spent:");
		System.out.println("\t\t" + rupeesSpent);
		System.out.print("\tUSD equivalent:");
		System.out.println("\t\t" + dollarsSpentInIndia);
		System.out.print("\tUSD remaining:");
		System.out.println("\t\t" + dollarsAfterIndia);
		System.out.println();

		System.out.println("Europe:");
		System.out.print("\tEuros spent:");
		System.out.println("\t\t" + eurosSpent);
		System.out.print("\tUSD equivalent:");
		System.out.println("\t\t" + dollarsSpentInEurope);
		System.out.print("\tUSD remaining:");
		System.out.println("\t\t" + dollarsAfterEurope);

		// print out '=' barrier
		for (int i = 0; i < 55; i++) {
			System.out.print("=");

			if (i == 54){
				System.out.println();
			}
		}

		System.out.printf("Remaining USD:\t\t%s\n\n", dollarsAfterEurope);


        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						   //cost per item of first souvenir
		int budget1 = 100;   						   //budget for first item
		int totalItems1 = budget1 / costItem1; 		   //how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;     //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;   //how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);
		System.out.println();

    } // end of main method
} // end of class

