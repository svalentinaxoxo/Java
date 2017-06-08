/* LSFox.java
 * Shelby Laquitara
 * 
 * The fox kills one chicken a day, and does not reproduce. 
 */
package lsunit5ch14;
import java.util.ArrayList;
import java.util.Random;

public class LSFox extends LSAnimal
{
    private static final Random rand = new Random();//creating an instance of random
    
    public void eat(ArrayList<LSChicken> chickenArray) //eat method
    {
        if(rand.nextInt(10) < 7) // random 70% of the time
        {
            LSChicken chicken = chickenArray.remove(rand.nextInt(chickenArray.size())); //remove chicken from array list               
            setWeight(this.getWeight() + chicken.getWeight()); //increases fox's weight by chicken's weight
        }
    }
    public void grow() //grow method
    {
        super.grow();
    }
} //end class LSFox


