package mymaths;

import java.util.ArrayList;

/**
 *
 * @author evonl
 */
public class MyMaths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //calculatorTest();
        Calculator calc = new Calculator();
        int a = Integer.parseInt(args[0]); //first argument we pass while running this method
        int b = Integer.parseInt(args[2]);
        if (args[1].equals("+")) {
            System.out.println(calc.add(a, b));
        } else if (args[1].equals("-")) {
            System.out.println(calc.subtract(a, b));
        }

        /*
        loopTest();
        ArrayList<String> invitees;//an array list of strings; it needs a name "invitees" 
        invitees = new ArrayList<>(); //You could put "String" inside of <>
        invitees.add("Paul");
        invitees.add("Peter");
        for (String invitee : invitees) //creating a string called "invitee" (this is a for each loop) for each invitee, the loop will run for every String that is in (:) the list "Invitees"
        {
            System.out.println(invitee);
        }

        
        String[] pets;
        pets = new String[3];
        pets[0] = "Cat";
        pets[1] = "Dog";
        pets[2] = "Fish";
        for (String pet : pets) {
            System.out.println(pet);
        }
         */
    }

    public static void loopTest() {
        System.out.println("~While loop");
        int i = 0;
        while (true) //or I could say while (i<10). If done this way, the if statement and break would not be necessary
        {
            //everything wil run unless told to specifically stop by using "break"
            System.out.println(i);

            if (i == 10) {
                break;
            }
            i = i + 1;
            //The other two ways to write the same statement would be:
            //i += 1;
            //i++;

        }
        System.out.println(); // Spacer

        System.out.println("~for loop");
        for (int a = 0; a <= 10; a++) //the second argument is the condition in which the loop would continue. if it was just <, it would stop at 9
        {
            System.out.println(a);
        }
        System.out.println(); //Spacer

        System.out.println("~Task 4");
        int a;
        for (a = 1; a <= 3; a++) {
            System.out.print("*");
        }
        System.out.println();//Printing a new line character
        System.out.println(); //Spacer

        System.out.println("~Task 5");
        int j, k;
        for (j = 1; j <= 3; j++) {
            for (k = 1; k <= 3; k++) {
                System.out.print("*");
            }
            System.out.println(); //Printing the new line character to make the 3 asterisks on 3 separate lines
        }
        System.out.println(" "); // Spacer

        System.out.println("~Task 6");
        int l, m;
        for (l = 1; l < 5; l++) {
            for (m = 1; m <= l; m++) {
                System.out.print("*");
            }
            System.out.println(); //Printing the new line character to make the 3 asterisks on 3 separate lines

        }
        System.out.println(); // Spacer

        System.out.println("~task 7");
        for (int q = 1; q < 5; q++) {
            for (int p = 1; p <= q; p++) {
                System.out.print("*");
            }
            System.out.println(); //Printing the new line character

        }
        System.out.println(); // Spacer

    }

    public static void calculatorTest() {
        Calculator calc;  // Creating a local variable called calc that variable has the data type Calculator. If we didnt have calculator.java, this line would throw in an error.
        calc = new Calculator();        //new Calculator returns an instance of the Calculator class 
        System.out.println(calc.add(1, 2));
        System.out.println("Hello World");

        //String myString = "Hello World";
        //String myOtherString = new String();
        //int myInt = 45;
        //double myDouble = 32d;
        System.out.println(calc.add(2, 83)); //add is the method in Calculator.java
        System.out.println(calc.subtract(143, 61));
        System.out.println(calc.subtract(calc.add(45, 90), 21));
        //System.out.println(calc.subtract(135, 21));
        //new Calculator().add(2,6); // This is also a valid way of creating and using an instance of Calculator
        System.out.println(calc.multiply(5, 7));
        System.out.println(calc.divide(7, 4));
        System.out.println(calc.min(52, 78));
        System.out.println(calc.max(921, 922));
        System.out.println(calc.absolute(-45));
    }

}
