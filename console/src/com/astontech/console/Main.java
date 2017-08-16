package com.astontech.console;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {

    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static boolean myBool;
    static char myChar;


    public static void main(String[] args) {

        Test myTest = new Test();
    }

    private static void LessonCalculatorLAB() {

        int[] inputs = new int[2];
        Scanner inputScanner = new Scanner(System.in);
        char operator;
        Scanner thirdScanner = new Scanner(System.in);
        double result = 0;

        for (int i = 0; i < inputs.length; i++) {
            do {
                System.out.println("Enter a number within the range of 0 to 9: ");
                inputs[i] = inputScanner.nextInt();
                if (inputs[i] < 0 || inputs[i] > 9){
                    System.out.println("Digit entered must be between 0 and 9!");
                    i--;
                }
            } while (inputs[i] < 0 || inputs[i] > 9);
        }

        do {
            System.out.println("Enter an operator (+, -, /, *): ");
            operator = thirdScanner.next().charAt(0);
            if (operator != '+' && operator != '-' && operator != '/' && operator != '*') {
                System.out.println("Please enter a valid operator!");
            }
        } while (operator != '+' && operator != '-' && operator != '/' && operator != '*');

        switch (operator) {
            case '+':
                result = inputs[0] + inputs[1];
                break;

            case '-':
                result = inputs[0] - inputs[1];
                break;

            case '/':
                result = inputs[0] / inputs[1];
                break;

            case '*':
                result = inputs[0] * inputs[1];
                break;

            default:
                System.out.println("Something went wrong!");
                break;
        }
        System.out.println(result);
    }

    private static void LessonFizzBuzzLAB() {

        for (int x = 100; x > -1; x--) {
            if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else if (x % 15 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(x);
            }
        }
    }

    private static void LessonExceptions() throws Exception {
        //todo: simple unhandled exception
//        String firstName = "Bipin";
//        int x = Integer.parseInt(firstName);
//
//        System.out.print("Integer value: ");
//        System.out.println(x);

        //todo: try - catch block
//        String firstName = "Bipin";
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer value: ");
//            System.out.println(x);
//        } catch(NumberFormatException ex) {
//            System.out.println("Exception: Invalid Number");
//        }

        //todo: try - catch with multiple catch blocks
//        String firstName = null;
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer value: ");
//            System.out.println(x);
//        } catch (IllegalArgumentException ex) {
//            System.out.println("Exception: String was null or empty");
//        } catch (NullPointerException ex) {
//            System.out.println("Exception: Null Pointer");
//        } catch (Exception ex) {
//            System.out.println("Exception: Generic Exception");
//        }

        //todo: try - catch with multiple catch and finally block
//        String firstName = null;
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer value: ");
//            System.out.println(x);
//        } catch (IllegalArgumentException ex) {
//            System.out.println("Exception: String was null or empty");
//        } catch (NullPointerException ex) {
//            System.out.println("Exception: Null Pointer");
//        } catch (Exception ex) {
//            System.out.println("Exception: Generic Exception");
//        } finally {
//            System.out.println("Program has been completed regardless of exceptions.");
//        }

        //todo: exception object
        //notes: base exception class
//        String firstName = null;
//        try {
//            int x = Integer.parseInt(firstName);
//
//            System.out.print("Integer value: ");
//            System.out.println(x);
//        } catch (IllegalArgumentException ex) {
//            System.out.println("Exception: " + ex.toString());
//        } catch (NullPointerException ex) {
//            System.out.println("Exception: " + ex.toString());
//        } catch (Exception ex) {
//            System.out.println("Exception: " + ex.toString());
//        } finally {
//            System.out.println("Program has been completed regardless of exceptions.");
//        }

        //todo: throwing an exception
        String firstName = null;
        try {
            int x = Integer.parseInt(firstName);

            System.out.print("Integer value: ");
            System.out.println(x);
        } catch (Exception ex) {
            throw new Exception("A custom exception from LessonExceptions method.", ex);
        }
    }

    private static void LessonFlowControl() {
        //notes:    IF-ELSE
        String name = "Tony";
        if(name.equals("Tony")) {
            System.out.println("correct first name");
            System.out.println("another line");

            if(name.length() > 10) {
                System.out.println("very long first name");
            } else if(name.length() > 5) {
                System.out.println("long first name");
            } else {
                System.out.println("short first name");
            }
        } else {
            System.out.println("incorrect first name");
        }

        //notes:    CASE-SWITCH
        switch(name) {
            case "Tony":
                System.out.println("cool dude man!");
                break;

            case "Anthony":
                System.out.println("pretty serious dude man");
                break;

            default:
                System.out.println("total fuckin loser man");
                break;
        }

    }

    private static void LessonOperators() {
        //notes:    plus and minus operators
        int val = 10;
        System.out.println(val + 10);
        System.out.println(val - 10);

        //notes: modulus (%) the remainder
        int modVal = 10 % 3;    //gives the remainder of 10 / 3 which is 1
        System.out.println(modVal);

        //notes:    increment and decrement
        System.out.println("increment after: ");
        System.out.println(val++);
        System.out.println(val++);
        System.out.println(val++);
        System.out.println(val);

        val = 10;
        System.out.println("increment before: ");
        System.out.println(++val);
        System.out.println(++val);
        System.out.println(++val);
        System.out.println(val);

        //decrement
        val = 10;
        System.out.println("decrement after: ");
        System.out.println(val--);
        System.out.println(val--);
        System.out.println(val--);
        System.out.println(val);

        val = 10;
        System.out.println("decrement before: ");
        System.out.println(--val);
        System.out.println(--val);
        System.out.println(--val);
        System.out.println(val);

        //notes:    logical equals (==) / logical not equal (!=)
        val = 10;
        int anotherVal = 20;

        if(val == anotherVal)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        if(val != anotherVal)
            System.out.println("Not Equal");
        else
            System.out.println("Equal");

        //notes:    logical AND (&&) / logical OR (||)
        if(val == 10 && anotherVal == 20 || val == 11)
            System.out.println("true");
        else
            System.out.println("false");

        //notes:    negation (!)
        if(!(val == 10))
            System.out.println("is true");
        else
            System.out.println("not true");

        boolean boolVar = true;
        if(!boolVar)
            System.out.println("is true");
        else
            System.out.println("not true");
    }

    public static void LessonFundamentalsLAB() {
            //initialize the integer variable
            int variable = 0;
            //create a scanner called varReader
            Scanner varReader = new Scanner(System.in);
            //continue to prompt the user until they enter a variable between 1 and 10
            while (variable < 1 || variable > 10) {
                System.out.print("Please enter an integer between 1 and 10: ");
                variable = varReader.nextInt();
            }
            //add 1.75 to the variable entered and store as a double
            double newvar = variable + 1.75;
            //print the result of the addition
            System.out.println(newvar);

            //print the min and max values of all relevant primitive data types and then print the defaults (note: defaults were assigned because data types were declared outside the static method
            System.out.println("Min byte value   = " + Byte.MIN_VALUE);
            System.out.println("Max byte value   = " + Byte.MAX_VALUE);
            System.out.println(myShort);
            System.out.println("Min short value  = " + Short.MIN_VALUE);
            System.out.println("Max short value  = " + Short.MAX_VALUE);
            System.out.println(myInt);
            System.out.println("Min int value    = " + Integer.MIN_VALUE);
            System.out.println("Max int value    = " + Integer.MAX_VALUE);
            System.out.println(myLong);
            System.out.println("Min long value    = " + Long.MIN_VALUE);
            System.out.println("Max long value    = " + Long.MAX_VALUE);
            System.out.println(myFloat);
            System.out.println("Min float value  = " + Float.MIN_VALUE);
            System.out.println("Max float value  = " + Float.MAX_VALUE);
            System.out.println(myDouble);
            System.out.println("Min double value = " + Double.MIN_VALUE);
            System.out.println("Max double value = " + Double.MAX_VALUE);
            System.out.println(myBool);
            myBool = true;
            System.out.println(myBool);
            myBool = false;
            System.out.println(myBool);
            System.out.println(myChar);
            myChar = 0;
            System.out.println(myChar);
            myChar = 65535;
            System.out.println(myChar);

            //prove a string is just an array of characters by creating an array of characters and then storing them in a string
            char[] toBeString = {'s','t','r','i','n','g','t','i','m','e'};
            String nowAString = new String(toBeString);
            //print the resulting string
            System.out.println(nowAString);

            //create a list
            List<String> iterateList = new ArrayList<>();
            //add strings to the list
            iterateList.add("Anthony");
            iterateList.add("Schwab");
            iterateList.add("is");
            iterateList.add("learning");
            iterateList.add("DEV");

            //for each string in the list, output that string on a line
            for(String listLoop : iterateList) {
                System.out.println(listLoop);
            }

            String GameName = "Powerball";
            String[] WinningNumbers = new String[6];
            WinningNumbers[0] = "12";
            WinningNumbers[1] = "22";
            WinningNumbers[2] = "81";
            WinningNumbers[3] = "42";
            WinningNumbers[4] = "32";
            WinningNumbers[5] = "50";
            int Jackpot = 34287400;
            LocalDate DrawingDate = LocalDate.of(2017, Month.JULY, 28);

            System.out.println("Lottery game: " + GameName);
            System.out.println("Winning numbers: " + WinningNumbers);
            System.out.println("Jackpot value: " + Jackpot);
            System.out.println("Drawing date: " + DrawingDate);

        }

    private static void LessonLists() {

        List<String> myStringCollection = new ArrayList<String>();

        myStringCollection.add("1st String");
        myStringCollection.add("2nd String");
        myStringCollection.add("3rd String");
        myStringCollection.add("4th String");
        myStringCollection.add("5th String");

        System.out.println(myStringCollection);
        for(String singleString : myStringCollection) {
            System.out.println(singleString);
        }

        List<Integer> myIntCollection = new ArrayList<Integer>();

        myIntCollection.add(10);
        myIntCollection.add(20);
        myIntCollection.add(30);
        myIntCollection.add(40);
        myIntCollection.add(50);

        System.out.println(myIntCollection);

        for(int singleInt : myIntCollection) {
            System.out.println(singleInt);
        }

        String[] myStringArray = new String[5];

        myStringArray[0] = "1st";
        myStringArray[1] = "2nd";
        myStringArray[2] = "3rd";
        myStringArray[3] = "4th";
        myStringArray[4] = "5th";

        System.out.println(myStringArray);

        for(String singleString : myStringArray) {
            System.out.println(singleString);
        }
    }

    private static void LessonStrings() {

        String firstString = "";
        //firstString = "value";
        firstString = null;

        if(firstString == null || firstString.isEmpty()) {
                System.out.println("String is empty");
        }   else {
                System.out.println("String has a value");
        }

        for(int x = 0; x <= 100; x++) {
            firstString = "new value: " + Integer.toString(x);
            System.out.println(firstString);
        }

        StringBuilder myStringBuilder = new StringBuilder();

        for(int x = 0; x <= 100; x++) {
            myStringBuilder.append("new value with string builder: ")
                           .append(Integer.toString(x))
                           .append("\n");
        }

        System.out.println(myStringBuilder);

        String myName = "Anthony Schwab";

        int indexOf = myName.indexOf("n");
        System.out.println(indexOf);

        int lastIndexOf = myName.lastIndexOf("a");
        System.out.println(lastIndexOf);

        String largeString = "This is a longer string than before";

        for(char c : largeString.toCharArray()) {
            System.out.println(c);
        }

        String partOfLargerString = largeString.substring(8, 16);
        System.out.println(partOfLargerString);
    }

    private static void LessonDataTypes() {

        //notes:    primitive data types
        //          int (number)
        //          float (floating point number, decimal)
        //          double (larger number)
        //          boolean (true or false)
        //          char (character)

        //notes:    common data types
        boolean myBool = false;
        int myInt = 4;
        String myString = "stuff and things";
        Date myDate = new Date();

        System.out.println(myBool);
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDate);

        String numberString = "341";
        int intFromString = Integer.parseInt(numberString);

        System.out.println(intFromString);

        int i = 312;
        String stringFromInt = Integer.toString(i);

        System.out.println(stringFromInt);

        //notes:    date -> string
        String stringFromDate = myDate.toString();

        System.out.println(stringFromDate);


    }

    private static void LessonVariables(String ScopeVar) {

        System.out.println(ScopeVar);

        String lastName = "Schwab", firstName = "Anthony";

        System.out.println(firstName + " " + lastName);

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String input = reader.nextLine();

        System.out.println("Hello " + input);

    }
}
