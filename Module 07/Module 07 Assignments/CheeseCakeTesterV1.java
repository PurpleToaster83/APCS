/**
 * @purpose to create and print out infromation about cheesecakes
 *
 * @author William Van Uitert
 * @version 01/08/2025
 */

import java.util.ArrayList;

public class CheeseCakeTesterV1 {
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        cake.add(new CheeseCakeV1("Blueberry", 4));
        cake.add(new CheeseCakeV1("Strawberry", 7));
        cake.add(new CheeseCakeV1("Cherry", 1));
        cake.add(new CheeseCakeV1("Jalapeno", 5));
        cake.add(new CheeseCakeV1("Raspberry", 3));
        cake.add(new CheeseCakeV1("Fig", 4));
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcCreamCheese();
            dataRecord.calcSugar();
            dataRecord.calcTotalServings();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            System.out.println(" |   " + index + "   |" + cake.get(index));
        }
    }
}
