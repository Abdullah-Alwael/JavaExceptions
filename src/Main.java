import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, number1, number2, number3; //define two integer variables
        float centigrade;

//TODO add try catch to all Questions, if else use throw throws, do not use both throws and throw in the same method

//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input


        System.out.println("Calculator:");
        try {
            System.out.println("enter first number: ");
            number1 = input.nextInt();

            System.out.println("enter second number (>0)"); // can not divide by 0!
            number2 = input.nextInt();

            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));

        } catch (InputMismatchException e) {
            System.out.println("This is not a number, try again...");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero (0)");
        } catch (Exception e) {
            System.out.println("An error occurred");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine(); // since input.nextInt() does not take the entire line EOL \n, if an exception occurs,
            // it will daisy-chain to the next input.nextInt(); and hence we need to flush it here!
        }


//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.


        System.out.println("Multiplication table");

        try {
            System.out.println("enter a number to create a table: ");
            number = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine(); // flush the input
        }

//        3. Write a Java program to print the area and perimeter of a circle
        System.out.println("area and perimeter of a circle calculator: ");

        double radius, perimeter, area; // define 3 variables

        try {
            System.out.println("enter the radius of a circle: ");
            radius = input.nextDouble();

            perimeter = 2 * Math.PI * radius;
            System.out.println("perimeter is: " + perimeter);

            area = Math.PI * radius * radius;
            System.out.println("area is: " + area);

        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine(); // flush the input
        }


//        4. Java program to find out the average of a set of integers

        System.out.println("Finding average");
        double sum = 0, average;
        String cont;
        int rounds = 0;

        try {
            do {
                System.out.println("enter an integer");
                number = input.nextInt();
                sum += number;
                rounds++;
                System.out.println("continue? yes/no");
                input.nextLine();
                cont = input.nextLine();
            } while (cont.equals("yes"));

            average = sum / rounds; // possible divide by 0!
            System.out.println("The average is = " + average);

        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero (0)");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine(); // flush the input
        }


//            5. Write a Java program that accepts three integers as input, adds the first two integers
//            together, and then determines whether the sum is equal to the third integer.

        System.out.println("find equal third:");

        try {
            System.out.println("enter first number: ");
            number1 = input.nextInt();

            System.out.println("enter second number: ");
            number2 = input.nextInt();

            System.out.println("enter third number: ");
            number3 = input.nextInt();

            if ((number1 + number2) == number3) {
                System.out.println("they are equal");
            } else {
                throw new ArithmeticException("they are not equal"); // using throw instead of println();
            }
        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine(); // flush the input
        }


//        6. Write a Java program to reverse a word.

        System.out.println("word reverse program:");
        try {
            System.out.println("enter a word to reverse");
            String word = input.nextLine();

            System.out.println("the reverse is: ");
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.toCharArray()[i]);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Enter a valid word");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound!");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine();
        }


//        7 - Java program to check whether the given number is even or odd
        System.out.println();
        System.out.println("even odd finder:");


        do {
            System.out.println("enter a number (greater than 0)");

            try {
                number = input.nextInt();

                if (number <= 0) {
                    throw new ArithmeticException("the number cant be negative or zero, try again");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("This is not a number, try again...");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred . . .");
                System.out.println(e.getMessage());
            } finally {
                input.nextLine();
            }

        } while (true);

        try {
            isEven(number); // throws the answer
        } catch (ArithmeticException e) { // gets the answer
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
        }


//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("temperature converter:");


        try {
            System.out.println("enter the temperature in centigrade:");
            centigrade = input.nextFloat();

            System.out.println("the temperature converted to fahrenheit is: " + (centigrade * 1.8f + 32));

        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine(); // flush the input
        }

//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
        System.out.println("character finder");
        String sentence;
        try {
            System.out.println("enter a sentence:");
            sentence = input.nextLine();

            System.out.println("enter index number: ");
            int index = input.nextInt(); // after this one, flush

            if (index < 0) {
                throw new ArithmeticException("Index can not be less than zero (<0)");
            }
            System.out.println("the character at index " + index + " is " + sentence.charAt(index));

        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The index is more than the length of the sentence (out of bound)");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine(); // use after nextInt();
        }


//        10. Write a Java program to print the area and perimeter of a rectangle.
        System.out.println("perimeter of a rectangle finder");

        double width, height;

        try {
            System.out.println("enter width:");
            width = input.nextDouble();

            System.out.println("enter height:");
            height = input.nextDouble();

            area = width * height;
            System.out.println("area is = " + area);

            perimeter = 2 * (width + height);
            System.out.println("perimeter is = " + perimeter);

        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine();
        }


//        11. Write a Java program to compare two numbers.
        System.out.println("compare two numbers helper: ");

        try {
            System.out.println("enter first number:");
            number1 = input.nextInt();

            System.out.println("enter second number:");
            number2 = input.nextInt();

            if (number1 != number2) {
                System.out.println(number1 + " != " + number2);
            } else {
                System.out.println(number1 + " = " + number2);
            }
            if (number1 < number2) {
                System.out.println(number1 + " < " + number2);
            } else {
                System.out.println(number1 + " >= " + number2);
            }
            if (number1 <= number2) {
                System.out.println(number1 + " <= " + number2);
            } else {
                System.out.println(number1 + " > " + number2);
            }

        } catch (InputMismatchException e) {
            System.out.println("This is not a number, try again later ...");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine();
        }


//        12. Write a Java program to convert seconds to hours, minutes and seconds.
        System.out.println("seconds calculator:");
        int initialSeconds, seconds, minutes, hours;
        try {
            System.out.println("enter the number of seconds to convert to hours, minutes and remaining seconds ");
            initialSeconds = input.nextInt();
            seconds = initialSeconds;

            hours = seconds / 3600; // correct calculation
            seconds -= hours * 3600; // is exactly seconds = seconds - hours
            minutes = (seconds / 60); // needs to factor out the hours first, correct calculation
            seconds -= minutes * 60; // needs to factor out the minutes, correct calculation

            System.out.println(initialSeconds + " seconds is = " +
                    hours + " hours and " +
                    minutes + " minutes and " + seconds);

        } catch (InputMismatchException e) {
            System.out.println("This is not a number, try again later ...");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine();
        }

//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.

        System.out.println("four equals finder:");

        try {
            System.out.println("enter a number");
            number1 = input.nextInt();

            System.out.println("enter a second number");
            number2 = input.nextInt();

            System.out.println("enter a third number number");
            number3 = input.nextInt();

            System.out.println("enter a forth number");
            int number4 = input.nextInt();


            if (number1 == number2 && number1 == number3 && number1 == number4) {
                System.out.println("They are equal");
            } else {
                System.out.println("They are not equal");
            }
        } catch (InputMismatchException e) {
            System.out.println("This is not a number, try again later ...");
        } catch (Exception e) {
            System.out.println("An error occurred . . .");
            System.out.println(e.getMessage());
        } finally {
            input.nextLine();
        }

//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive

        System.out.println("finding number sign");
        System.out.println("enter a number: ");
        number = input.nextInt();

        if (number == 0) {
            System.out.println("number is zero");
        } else if (number > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }

//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 ,
//                Don’t count -1).

        System.out.println("finding sign numbers count:");
        int positive = 0, negative = 0, zeros = 0;

        do {
            System.out.println("enter a number (to stop enter -1)");
            number = input.nextInt();
            if (number == -1) {
                break;
            }
            if (number == 0) {
                zeros++;
            } else if (number > 0) {
                positive++;
            } else {
                negative++;
            }
        } while (true);

        System.out.println("the number of zeros is " + zeros);
        System.out.println("the number of positives is " + positive);
        System.out.println("the number of negatives is " + negative);

//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
        System.out.println("reverse number finder:");
        System.out.println("enter an integer number:");
        number = input.nextInt();

        StringBuilder reverseNumber = new StringBuilder(String.valueOf(number));

        System.out.println("The reverse is " + reverseNumber.reverse());

        // second solution to Q16:

        System.out.println("------Using second solution:");
        double numberTemp;

        do {
            numberTemp = (double) number / 10;
            number /= 10;
            numberTemp -= number;
            numberTemp *= 10;
            System.out.print(Math.round(numberTemp));
        } while (number != 0);
        System.out.println();

//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.

        System.out.println("find largest and smallest numbers");
        int largest = 0, smallest = 0;
        boolean firstRun = true;

        do {
            System.out.println("enter a number");
            number = input.nextInt();

            if (firstRun) {
                largest = number;
                smallest = number;
                firstRun = false;
            }

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            System.out.println("continue? yes/no");
            input.nextLine();
            cont = input.nextLine();
        } while (cont.equals("yes"));

        System.out.println("the largest number is " + largest);
        System.out.println("the smallest number is " + smallest);

//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.

        System.out.println("char 'a' appearance count:");

        System.out.println("enter a sentence:");
        sentence = input.nextLine();

        int numberOfA = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.toCharArray()[i] == 'a') {
                numberOfA++;
            }
        }

        System.out.println("the number of 'a' in the sentence is " + numberOfA);
    }

    //Q7
    public static void isEven(int number) throws ArithmeticException {
        if (number % 2 == 0) {
            throw new ArithmeticException(number + " is even");
        } else {
            throw new ArithmeticException(number + " is odd");
        }
    }
}
