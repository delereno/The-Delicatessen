import java.util.Scanner;
public class VariableTypesTest{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give a string:");
    String ans = scanner.nextLine();
    System.out.println("Give an integer:");
    String ans2 = scanner.nextLine();
    int num = Integer.valueOf(ans2);
    System.out.println("Give a double:");
    String ans3 = scanner.nextLine();
    double doub = Double.valueOf(ans3);
    System.out.println("Give a boolean:");
    String ans4 = scanner.nextLine();
    boolean bool = Boolean.valueOf(ans4);
    System.out.println("You gave the string " + ans);
    System.out.println("You gave the integer " + num);
    System.out.println("You gave the double " + doub);
    System.out.println("You gave the boolean " + bool);
}
}