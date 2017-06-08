/* LSChicken.java
 * Shelby Laquitara
 * 
 * The Chicken can reproduce if conditions are met, and can only happen if different sex and over 1.
 */
package lsunit5ch14;
import java.util.Random;
import java.util.ArrayList;

public class LSChicken extends LSAnimal
{
    private static Random rand = new Random();
    
    public LSChicken()
    {
        this.setSex(rand.nextBoolean());//randomly chose sex
        setAge(1); // set age to 1
        setWeight(1); // set weight to 1 
    }
    
    public void grow() //grow method
    {
        setAge(getAge() + 1); // increase age of chicken by 1
        setWeight(getWeight() * 1.01); // increase weight of chicken by 1% of current weight
    }
    
    public static void mate(ArrayList<LSChicken> array) //static mate method, recieve chicken arraylist as an argument           
    {
        int index = rand.nextInt(array.size()); //setting index to random array size
        int index2 = rand.nextInt(array.size()); //setting index2 to random array size 
        while(index < 0 || index == index2) //using loop to set the terms if index is less than 0 then the index and index2 will be equivalent 
        {
            index = rand.nextInt(array.size()); //then the index will be set to the random size
            index2 = rand.nextInt(array.size()); //then the index2 will be set to the random size
        }
        LSChicken chicken1 = array.get(index);  //chix 1 will be set to random chix in array
        LSChicken chicken2 = array.get(index2);//chix 2 will be set to random chix in array
        if(chicken1.getisMale() != chicken2.getisMale() && //if there is one male and one female
            chicken1.getAge() > 1 && chicken2.getAge() > 1) //both older than a day old
        {
            int newChickens = rand.nextInt(5); //randonly create 0-4 chickens
            for(int i = 0; i < newChickens; i++)
            {
                array.add(new LSChicken()); //append to the array
            }
        }         
    }
} //end class LSChicken
    
