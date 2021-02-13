/*Comment line(drop down with ENTER/multiple)
 * like this
 * or this
 * maybe this?
 * try this
 * wow
 * ok
 */
//Comment line(single)
class FirstClass //creating a class, plus the name of the program (firstClass)
    {
        public static void main(String [] args){ 
        /*creating a main method inside a class (this is one of the most important Java methods)
         * the main() method is the entry point into the java app 
         * first three words are keywords
         * public is an access modifier of the main method, 
         * java runtime can only execute this method as it is public, otherwise it cannot be executed by and program
         * static allows JVM to load the class into memory and call the main method
         * void is keyword that means a method will not return anything
         * main is the name of the method
         * method will only accept a string type argument to bring into the method, set by user
         */
        
        System.out.println("Hello World");// prints a specific string, ;(semicolon) will terminate
        //adding ln to print starts a new line afterwards, seperating lines
        for(String s : args){ //runs a for loop that repeats for as many string arguments there are
        System.out.println(s); //prints out whatever string that "s" is at time of looping
        }
    }
     
}
        
        
        
        