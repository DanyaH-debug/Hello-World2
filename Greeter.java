
/**
 * A class for producing simple greetings.
 *
 * @author Danya Hammoudeh
 * @version 01/31/2021
 */
public class Greeter
{
    /**
     * Constructs object that can greet a person or entity.
     * @param aName the name of the person or entity who should be addressed in the greetings.
     */
     public Greeter(String aName) //A constructor Greeter(String aName) that is used to construct new objects of this class
    {
         name = aName;
    }
    
    /**
     * Greet with a hello message.
     * @return a message containing "Hello" and the name of the greeted person or entity. 
     */
     public String sayHello() //A method sayHello() that you can apply to objects of this class.
    {
         return "Hello, " + name + "!";
    }
    
    private String name;  //A field name.
    
}

 
