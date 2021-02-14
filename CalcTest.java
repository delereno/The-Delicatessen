import java.util.Scanner;
public class CalcTest{
    public static void main(String[] args){
    
    //First sum calc
    int frst  = 5;
    System.out.println(frst); //Prints 5
    int scnd = 3;
    System.out.println(scnd); //Prints 3
    int sum = frst + scnd; //Assigns the sum of first and second numbers to the variable sum
        System.out.println(sum);
    
    //Second sum calc (with and without Parentheses)
    int calcwPar = (1 + 2) + 5 * (7 + 9);
    System.out.println(calcwPar); //Prints 83
    calcwPar = calcwPar + 5 * (2 + 5);
    System.out.println(calcwPar); //Prints 118
    int calcwoPar = 1 + 2 + 5 * 7 + 9;
        System.out.println(calcwoPar); //Prints 47
    calcwoPar = calcwoPar + 5 * 2 + 5;
    System.out.println(calcwoPar); //Prints 62
    
    //Third sum calc (days to seconds)
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many days would you like to convert to seconds?");
    String num = scanner.nextLine();
    int sec = Integer.valueOf(num) * 24 * 60 * 60;
    System.out.println(sec);
    
    //Fourth sum calc (operand test)
    System.out.println(2 + 2 + "!"); //all operands, even ints are converted into strings before being printed, making 2 + 2 print as 22 instead of 4.
    
    //Fifth sum calc (Sum of two numbers)
    System.out.println("Give the first number:");
    int numb = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    int numb2 = Integer.valueOf(scanner.nextLine()); 
    System.out.println("The sum of the numbers is " + (numb + numb2)); //Without second layer of brackets, the numbers would be appended as strings, not integers.
    
    //Fifth sum calc (Sum of two numbers)
    System.out.println("Give the first number:");
    int numbe = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    int numbe2 = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the third number:");
    int numbe3 = Integer.valueOf(scanner.nextLine()); 
    System.out.println("The sum of the numbers is " + (numbe + numbe2 + numbe3)); //Without second layer of brackets, the numbers would be appended as strings, not integers
    
    //Sixth sum calc (Product of two numbers)
    System.out.println("Give the first number:");
    int nm = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    int nm2 = Integer.valueOf(scanner.nextLine()); 
    System.out.println("The product of the numbers is " + (nm * nm2));
    //Seventh sum calc (Quotient of two numbers)
    //Sixth sum calc (Product of two numbers)
    System.out.println("Give the first number:");
    int nmb = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    int nmb2 = Integer.valueOf(scanner.nextLine()); 
    System.out.println("The rounded product of the numbers is " + (nmb / nmb2)); //When int numbers are divided, they are automatically rounded after
    System.out.println("The non-rounded product of the numbers is " + ((double)nmb / nmb2)); //Place a (double) infront of a number in a command to utilise a type-casting operation.
    

    
    }
}