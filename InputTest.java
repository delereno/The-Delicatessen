//Import the scanner tool that comes with java
import java.util.Scanner;

//Create the public class inputTest, the main program    
public class InputTest{ 
    
    //Create main method
    public static void main(String [] args){
        //Create a tool that can read user input, name it scanner
        Scanner scanner = new Scanner(System.in); 
        
        //Print "Please input a message:"
        System.out.println("Please input a message: ");
        
        //Reads the string entered by the user, and assigns it 
        //to program memory "String message = (string input given)"
        // .nextline() waits for the user's input in the next line,
        //and assigns it to the String "message"
        String message = scanner.nextLine();
        
        //Prints the message written by user
        System.out.println(message);
        
    }
    
}