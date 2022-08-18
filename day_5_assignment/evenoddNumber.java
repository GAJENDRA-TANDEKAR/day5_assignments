package day_5_assignment;


import java.util.Scanner;
public class evenoddNumber
{
    public static void main(String[] args)
    {
        int x;
        Scanner evenodd = new Scanner(System.in);
        System.out.print("Enter the number :");
        x =  evenodd.nextInt();
        if(x % 2 == 0)
        {
            System.out.println( x+" is  the Even number ");
        }
        else
        {
            System.out.println( x+" is  the Odd number ");
        }
    }
}

/*
o.p 1
5 is  the Odd number

Process finished with exit code 0

o.p 2

2 is  the Even number

Process finished with exit code 0
 */