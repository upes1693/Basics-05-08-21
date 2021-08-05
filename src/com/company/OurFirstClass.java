package com.company;

//Format the code Ctrl+Alt+l
//Copy the whole line Ctrl+d
//Mark line as comment Ctrl+?
//Mark the whole line Ctrl+K+C

public class OurFirstClass {

    public static void main(String[] args) {
        //Variables are a way to store information on our computer.
        //We can access variables that we define in the program by the name
        //we are giving them
        //When we access a variable the computer is figuring out by himself
        //where the variable is stored on the RAM and gets the value from there
        //a variable value can be changed during the program
        //To create a variable:
        //1. Identify the type
        //2. Give a name
        //3. optional- Give a value (the value is usually a literal)

        //Creating a variable is also called declaring a variable.
        //Giving it a value for the first time is also called initialization

        //While you can name your variable almost anything, there are some rules.
        //A variable name should start with an alphabetic character (like a, b, c, etc.)
        // and can include letters, numbers, and underscores _.
        // It must be all one word with no spaces.
        //Use meaningful variable names!
        //Start variable names with a lowercase letter and use camelCase.
        //Variable names are case-sensitive and spelling sensitive!
        // Each use of the variable in the code must match the variable name in the declaration
        // exactly.
        //Never put variable name inside quotes (” “).

        //we can define our variables by lot of different types, those are called data types.
        //All the data types are keywords

        //In Java primitive types are the most basic data types, there are 8 of them:
        //When you create a primitive variable Java will set aside enough bits in memory
        //for that primitive type and associate that memory location with the name that
        //you used.

        //There are two types of variables in Java: primitive variables that hold primitive
        //types and object variables that hold a reference to an object of a class.
        //A reference is a way to find the object
        // (like a UPS tracking number helps you find your package).

        int myInt = 10;
        int mySecondInt = 25;
        System.out.println("My int: " + myInt);
        boolean isOver43Eighte__en2 = true;
        //System.out.println(myInt + mySecondInt);
        int i = 5;
        byte b = 10;
        char c = 'h';
        char c2 = '\u0044';
        //System.out.println(c2);
        short s = 120;
        long l = 999999l;
        long longWithUnderScore= 9_999_999L;
        float f = 50.50F;
        double d = 999.7_654_321;

        int withUndersocre=5_000_000;
        System.out.println(withUndersocre);


        //Wrapper classes- each one of the primitive types has a wrapper class like Integer
        //Boolean Long etc.. the wrapper class gives us a way to perform operations on the data type

        int maxOfTwo = Integer.max(5, 7);
        System.out.println(maxOfTwo);
        //Trying putting two numbers inside a place in the memory where they won't fit
        // is called overflow/underflow. If it's larger than max value it's called overflow.
        //If it's smaller than min value it's called underflow.
        long maxLongEver = Long.MAX_VALUE;
        //System.out.println(maxLongEver);
        System.out.println(Long.MIN_VALUE-1);
        boolean isDigit = Character.isDigit('4');
        //System.out.println(isDigit);

        //String literal- sny sequence of characters surrounded by double quotes
        //is a String literal in Java. It's value can't be changed unlike a variable.

        String str="Hello";
    }
}
