import java.util.Scanner;
public class VariableTest{
    public static void main(String [] args){
    
    //define a string, int, double and boolean variable
    String tractor = "Zetor";
    int chicken = 9000; 
    double bacon = 0.3;
    bacon = 0.1; //after assigning a variable type, it remains set. However, an integer may become a double, but not vice versa
    boolean trueOrFalse = true;
    
    //Print nutritional information
    System.out.println("Chicken:");
    System.out.println(chicken);
    System.out.println("Bacon(kg):");
    System.out.println(bacon);
    System.out.println("Tractor:");
    System.out.println(tractor);
    System.out.println("");
    System.out.println("And finally, a summary:");
    System.out.println(chicken);
    System.out.println(bacon);
    System.out.println(tractor);
    
    System.out.println("hey give me a number and i'll add 2 to it.");
    Scanner scanner = new Scanner(System.in);
    String numb = scanner.nextLine();
    int num = Integer.valueOf(numb) + 2;
    
    System.out.println(num);
    }
}