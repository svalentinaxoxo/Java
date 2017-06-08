/* LSAnimal.java
 * Shelby Laquitara 
 * 
 * The animal is the parent class for the child fox and chickens.
 */
package lsunit5ch14;
public class LSAnimal 
{
    private String name; // instance variable
    private int age; // instance variable
    private double weight; // instance variable 
    private boolean isMale; // instance variable 
    
    public LSAnimal() 
    {
        age = 1; //set age to 1 
        name = "Unnamed Animal"; //set name to Unnamed Animal
        weight = 0; //set weight to 0
        isMale = false; //set isMale to false 
    }
    public void grow() //grow method 
    {
        age++; //increase age by one 
    }
    public int getAge()
    {
        return age; //return value of age 
    }
    public String getName()
    {
        return name; //return value of name
    }    
    public double getWeight()
    { 
        return weight; //return value of weight 
    }
    public boolean getisMale()
    {
        return isMale; //return value
    }
    public void setAge(int age)
    {
        this.age = age; //set value
    }
    public void setName(String name)
    {
        this.name = name; //set value
    }
    public void setWeight(double weight)
    {
        this.weight = weight; //set value
    }
    public void setSex(boolean isMale)
    {
        this.isMale = isMale; //set value
    }    
} //end class LSAnimal

