import java.util.Scanner;
//create the public class
public class StringsTest{
    
    //create the main method
    public static void main(String [] args){
        
    //Sets up the Scanner tool, allows the program to read strings
    Scanner scanner = new Scanner(System.in);
    //Asks the user for a catchphrase string, stores it as catchphrase variable
    System.out.println("Quick! Give me a catchphrase!");
    String catchphrase = scanner.nextLine();
    
    //Define the String variable hello
    String hello = "hello world";
    
    //Print the String variable hello
    System.out.println(hello);
    
    //Define the String variable feeling
    String feeling = " and how are you feeling today?";
    
    //Prints the hello and feeling String variables together
    System.out.println(hello + feeling);
    
    //Prints a joined String variable pair
    System.out.println("I'm doing great," + "thank you very much!");
    
    //Prints a joined String variable and String literal
    System.out.println("Well, I'll say it again, with gusto, " + hello + "!");
    
    System.out.println(catchphrase);
    System.out.println(catchphrase);
    System.out.println(catchphrase);
    }
}