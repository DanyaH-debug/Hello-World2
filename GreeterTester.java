
/**
 * Write a description of class GreeterTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreeterTester
{
   
 public static void main(String[] args)
 {
     
     Greeter worldGreeter = new Greeter("World"); //Greeter object stores an object variable that is the result of the new operator. 
     String greeting = worldGreeter.sayHello(); //Invokes the sayHello method and captures the result in a string variable, 
     System.out.println(greeting);
     
 }
 
}
