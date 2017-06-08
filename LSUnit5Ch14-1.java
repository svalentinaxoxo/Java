/* LSUnit5Ch14.java
 * Shelby Laquitara 
 * 
 * This is the driver class.
 */
package lsunit5ch14;
import java.util.ArrayList;

public class LSUnit5Ch14 
{
    public static void main(String[] args)
    {
        for(int count=0; count<10; count++)
        {
            LSFox foxy = new LSFox(); //setting LSfox foxy to new LSFox
            ArrayList< LSChicken > chickens = new ArrayList<LSChicken>(); //creating an arraylist 
            chickens.clear();
            chickens.add(new LSChicken()); //add method 
            chickens.add(new LSChicken ());
            chickens.add(new LSChicken ());
            chickens.get(0).setSex(true); // get method 
            chickens.get(1).setSex(false);
            chickens.get(2).setSex(false);
            while (chickens.size() >1 && chickens.size() < 10) //depending on if the chickens size is greater than 1 and less than 10
            {
                for (LSChicken c:chickens)
                    c.grow();
                foxy.grow();
                LSChicken.mate(chickens);
                foxy.eat(chickens);
            }
            if (chickens.size() >= 10) //the output will repeat 10 times
            {
                System.out.println("Chickens win - Chicken population: " + //output will be chickens win
                        chickens.size());
            }
            else
            {
                System.out.printf("Fox wins - Fox weight <in chickens>: %.2f\n",  //output will be fox wins
                        foxy.getWeight());
            }          
        }
    }    
}//end class LSUnit5Ch14
