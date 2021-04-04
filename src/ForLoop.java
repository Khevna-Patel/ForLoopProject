import javafx.beans.binding.Bindings;

import java.util.Locale;
import java.util.Scanner;

public class ForLoop<num1>
{
    //----------------------------------------------Program:1--------------------------------------------------------------

    //Print any 10 numbers between user input range

    public void printAny10Numbers()  //Instance method
    {
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Type First Number");
        int FirstNumber = scanner.nextInt();      //declaring variable by scanner class
        System.out.println("Type Last Number");
        int LastNumber = scanner.nextInt();
        System.out.println("Below numbers are printed as required");
        for (int i = FirstNumber; i <= LastNumber && i < FirstNumber+10; i++)      //using for loop method to print numbers
        {
            System.out.println(i);//output any 10 numbers
        }
    }


    //--------------------------------------------------Program:2---------------------------------------------------------

    //Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)- limitation is n
    //declaring numbers of variables
    public void sequenceOfFibonacciNumbers() //creating instance method
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Number of Fibonacci series you want to print: ");
        //declaring variables
        int maxNumber = scanner.nextInt();
        int previousNumber = 0;
        int nextNumber = 1;
        int sum;


        System.out.println("Fibonacci series of numbers:"); //statement
        System.out.println(previousNumber + "" + nextNumber + "");

        for (int i = 2; i <= maxNumber; i++)
        //using for loop method to find fibonacci numbers
        //on each iteration, we are assigning second number to the first number
        //and assigning the sum of last two numbers to the second number
        {
            sum = previousNumber + nextNumber;
            System.out.println(sum + " ");
            previousNumber = nextNumber;
            nextNumber = sum;
        }


    }

    //------------------------------------------------Program:3---------------------------------------------------------

    //  Program to check whether the input number is prime or not

    public void primeNumber()//instance method
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter the Number");
        int inputNumber = scanner.nextInt();//capture the input in an integer
        int a = 0;//declaring variable
        //Loop to check whether the number is divisible by any number
        for (int i = 2; i <= inputNumber - 1; i++) {
            if (inputNumber % i == 0)//checking number is divided by itself
            {
                a = a + 1;
            }
        }
        {
            if (a == 0)//if condition to check number is prime number
            {
                System.out.println(inputNumber + " is Prime Number");
            } else//else condition if a==0 is not true
            {
                System.out.println(inputNumber + " is Not a Prime Number");
            }
        }
    }


    //----------------------------------------------------Program:4--------------------------------------------------------

    //Reverse a number using for Loop

    public void reverseNumbers()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter a number to reverse:");
        int num = scanner.nextInt();//captured input will be stored in number num
        int reversed = 0;

        //for loop: no initialization because number is initialized already
        //no increment/decrement part because num/=10 decreases the value of num
        for (; num != 0; num /= 10)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Numbers: " + reversed);

    }


    //-------------------------------------------------Program:5------------------------------------------------------------
    //Finding factorial of a number entered by user

    public void factorial_Of_Number()//instance method
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter number you wish to find Factorial");
        int num = scanner.nextInt();//capture value will be stored in number num
        int factorial = 1;

        //for loop to loop through all numbers between 1 and the given number(num)
        //and the product of each number till num is stored in a variable factorial
        for (int i = num; i > 0; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of number " + num + " is " + factorial);//condition to print factorial

    }


    //---------------------------------------------------Program:6----------------------------------------------------------
    //Display sum of n Natural Numbers
    //Example: if 5 is Natural number then result should be  1+2+3+4+5=15


    public void sum_Of_Natural_Numbers()//creating instance method
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter Natural number: ");
        int n = scanner.nextInt();//capture value will be stored in number num
        int sum = 0;// variable sum initialized to 0

        //the for loop control variable i is initialized to 1
        //and is incrementing until it is less then or equal to n
        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + " is " + sum);
    }


    //--------------------------------------------------Program:7-----------------------------------------------------------
    //Program to make Calculator using the switch statement

    public void make_Calculator()//creating instance method
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter two numbers: ");

        //declaring value of double variables
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, %) : ");
        //declaring char and double variable
        char operator = scanner.next().charAt(0);
        double result = 0.0;

        //switch method
        switch (operator) {
            //when the operator matches the when condition
            //the control of the program will jump to result
            case '+':
                result = firstNumber + secondNumber;
                break;

            case '-':
                result = firstNumber - secondNumber;
                break;

            case '*':
                result = firstNumber * secondNumber;
                break;

            case '/':
                result = firstNumber / secondNumber;
                break;

                default:
                System.out.printf("Please enter correct operator");//formatted string
                return;
        }
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);//condition to print

    }


    //------------------------------------------------------Program:8-----------------------------------------------------------
//Program to print the sum of x ranging from 1 to 20

    public void sumOfXRange()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter number from 1 to 20: ");
        //declaring variables
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <=x ; i++)//for loop to print sum of x number ranging from 1 to 20
        {
            if (x > 20) //if number is more then 20 sum should not print
            {
                break;
            } else
                sum = sum + i;
        }
        System.out.println("Sum of numbers till " + x + " is " + sum);

    }



//------------------------------------------------------Program:9-----------------------------------------------------------
//Program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately


     public void numbers_Divided_By_3_5()//creating instance method
     {
         System.out.println();
         Scanner scanner = new Scanner(System.in);//declaring scanner for user input
         System.out.println("Print numbers divided by 3: ");
         for (int i = 1; i <= 100; i++)//for loop to find numbers divisible by 3
         {
             if (i % 3 == 0) //if condition to divide with 3
             {
                 System.out.println(i);
             }
         }
         System.out.println("Print numbers divided by 5: ");
         for (int i = 1; i <= 100; i++)//for loop to find numbers divisible by 5
         {
             if (i % 5 == 0) //if condition to divide with 5
             {
                 System.out.println(i);
             }

         }
     }
//------------------------------------------------------Program:10----------------------------------------------------------
//Program to print multiplication table for any number

    public void multiplication_Table()//creating instance method
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter number of the table you wish to print:  ");
        int num = scanner.nextInt();//declaring value of variable

        //for loop from 1 to 10 to print the multiplication table
        for (int i = 1; i <= 10 ; i++)
        {
            System.out.println(num + " * " + i + " = " + num * i);//applying condition to print table
        }
    }


//-------------------------------------------------------Program:11---------------------------------------------------------
//Program to enter any string and count total number of 'a' in that string

        public void count_Number_Of_a_From_String()
        {
            System.out.println();
            Scanner scanner = new Scanner(System.in);//declaring scanner for user input
            System.out.println("Enter the sentence");
            String x = scanner.nextLine();//declaring variable
            x = x.toLowerCase();
            System.out.println("Character/Frequency of letter 'a' ");
            for (char ch = 'a'; ch <= 'a'; ch++) //for loop to count frequency of a in the word/sentence
            {
                int y = 0;//declaring variable
                for (int i = 0; i < x.length(); i++)
                {
                    if (ch == x.charAt(i)) y++;
                }
                System.out.println(ch + " letter appeared " + y + " times in this word/sentence");
            }
        }


//----------------------------------------------------------Program:12------------------------------------------------------
//program to find out sum of numbers between a and b which are divisible by 9.

    public void sum_Of_Numbers_Divisible_By_9()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter starting number: ");// input from user
        int a = scanner.nextInt();//declaring variable
        System.out.println("Enter ending number: ");
        int b = scanner.nextInt();//declaring variable b
        int sum = 0;//declare a variable to store sum value

        System.out.println("Print numbers divided by 9: ");
        for (int i = a; i <=b ; i++)//loop to add numbers
        {
            if (i % 9 == 0)//condition to divide by 9
                System.out.println(i + " ");
            sum = sum + i;

        }
        System.out.println(" Sum of numbers divided by 9 is: " + sum );
    }




    //----------------------------------------------------------Program:13------------------------------------------------------
//Program to find min and maximum number from 3 numbers which user enters.


    public void findMinMaxNumber()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        int g = Math.max(a,b);
        g = Math.max(g, c);
        int s = Math.max(a, b);
        s = Math.min(s, c);

        System.out.println("Maximum number = " + g);
        System.out.println("Minimum number = " + s);

    }


//-----------------------------------------------------Program:14-----------------------------------------------------------
//Program to find average and sum between two numbers

    public void findAverageAndSumOfNumbers()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        System.out.println("Enter the starting number");//user input
        int a = scanner.nextInt();//declaring variable
        System.out.println("Enter ending number");//user input
        //declaring variables
        int b = scanner.nextInt();
        double avg = 0;
        double sum = 0;
        double loopCount = 0;

        for (int i = a; i <= b; i++)//for loop to find average and sum between two numbers
        {
            sum = sum + i;
            loopCount = b - a + 1;
            avg = sum / loopCount;//condition to find average
        }
        System.out.println("Sum of given numbers is: " + " " + sum);
        System.out.println("Average of given numbers is: " + " " + avg);
    }



//---------------------------------------------------Program:15---------------------------------------------------------
//Program to print triangular pattern


    public void triangularPattern()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);//declaring scanner for user input
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows ; i++)//outer loop for number of rows
        {
            for (int j = 1; j <= i ; j++)//inner loop for columns
            {
                System.out.print("* ");//print star
            }
            System.out.println();//ending line after each row
        }
    }


    public static void main(String[] args)
    {

        ForLoop forLoop = new ForLoop();//creating object to call instance method to static method

        System.out.println("----------------Ans:1 Print any 10 numbers between use input range------------------------");
        forLoop.printAny10Numbers();

        System.out.println();
        System.out.println("----------------Ans:2 Print the Fibonacci number sequence---------------------------------");
        forLoop.sequenceOfFibonacciNumbers();

        System.out.println();
        System.out.println("----------------Ans:3 Program to check input number is Prime or not-----------------------");
        forLoop.primeNumber();

        System.out.println();
        System.out.println("----------------Ans:4 Program to reverse the numbers--------------------------------------");
        forLoop.reverseNumbers();

        System.out.println();
        System.out.println("----------------Ans:5 Program to find factorial of the number entered by user-------------");
        forLoop.factorial_Of_Number();

        System.out.println();
        System.out.println("----------------Ans:6 Program to display sum of n natural number--------------------------");
        forLoop.sum_Of_Natural_Numbers();

        System.out.println();
        System.out.println("----------------Ans:7 Program to make calculator using switch---------------- ------------");
        forLoop.make_Calculator();

        System.out.println();
        System.out.println("---------------Ans:8 Program to print sum of x ranging from 1 to 20-----------------------");
        forLoop.sumOfXRange();

        System.out.println();
        System.out.println("---------Ans:9 Program to print numbers between 1 to 100 which can be divided bt 3 and 5--");
        forLoop.numbers_Divided_By_3_5();

        System.out.println();
        System.out.println("----------------Ans:10 Program to Print multiplication table------------------------------");
        forLoop.multiplication_Table();

        System.out.println();
        System.out.println("----------------Ans:11 Program to find number of 'a' in that string-----------------------");
        forLoop.count_Number_Of_a_From_String();

        System.out.println();
        System.out.println("----------------Ans:12 Program to find sum of numbers between a and b divided by 9--------");
        forLoop.sum_Of_Numbers_Divisible_By_9();

        System.out.println();
        System.out.println("----------------Ans:13 Program to find min and max number from 3 user input numbers-------");
        forLoop.findMinMaxNumber();

        System.out.println();
        System.out.println("----------------Ans:14 Program to find avg and sum between two user input numbers---------");
        forLoop.findAverageAndSumOfNumbers();

        System.out.println();
        System.out.println("---------------Ans: 15 Program to print triangular pattern -------------------------------");
        forLoop.triangularPattern();



    }

}



