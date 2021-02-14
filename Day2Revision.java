import java.util.Scanner;

public class Day2Revision{
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey...enter something cool");
        String ans = scanner.nextLine();
        System.out.println(ans);
        System.out.println("Now, enter a number and I'll add 8 to it.");
        String ans2 = scanner.nextLine();
        int num = Integer.valueOf(ans2) + 8;
        System.out.println("and, your final number is..."+ num + "!");
        double floatnum = Double.valueOf(ans2) + 0.2;
        System.out.println("Add 0.2?, no problem. Your (second )final number is..."+ floatnum + "!!");
        
        System.out.println("ok lie detector time. You are big guy? Please answer 'true' for yes, and anything else for false");
        String ans3 = scanner.nextLine();
        boolean bigGuy = Boolean.valueOf(ans3); //If the answer is "true" (case insensitive), then the boolean will be set as TRUE, any other answer will set it as false.
        System.out.println("OhO, you think that answer is..." + bigGuy + "?");
        System.out.println("I kinda agree, to be honest.");
    }
}