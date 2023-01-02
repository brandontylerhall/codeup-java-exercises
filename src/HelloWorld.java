public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.*/
        int myFavoriteNumber = 9;
        System.out.println(myFavoriteNumber);
        /*Create a String variable named myString and assign a string value to it, then print the variable out to the console.*/
        String myString = "Gorgonzola sauce";
        System.out.println(myString);
        /*Change your code to assign the value 3.14159 to myString. What happens?*/
        myString = String.valueOf(3.14159);
        /*Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?*/
        float myNumber = 3.14F;
        System.out.println(myNumber);
        /*Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?*/
        /*float myNumber = 3.14F;*/
        /*double myNumber = 3.14;*/

        /*Copy and paste the following code blocks one at a time and execute them
         * What is the difference between the above code blocks? Explain why the code outputs what it does.*/
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        /*Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?*/
        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
//        string cannot be cast to integer
    }
}