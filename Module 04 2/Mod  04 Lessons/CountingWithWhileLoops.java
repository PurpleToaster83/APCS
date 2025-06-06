
/**
 * The purpose of this program is to illustrate the use of the
 * while loop as a counter.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
public class CountingWithWhileLoops
{
    public static void main(String [] args)
    {
        double counter = 10.1;
        double theTerminator = 0.0;          //initialize the terminating value

        while(counter > theTerminator)     //test the terminating condition
        {
            System.out.println("counter = " + counter);
            counter -= 0.5;
        }//end of while loop

    }//end of main method
}//end of class
