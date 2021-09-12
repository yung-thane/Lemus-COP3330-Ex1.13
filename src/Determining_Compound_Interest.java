/*
 *  UCF COP3330 Fall 2021 Assignment 1.13 Solution
 *  Copyright 2021 Ronald Lemus
 */

import java.util.Scanner;


public class Determining_Compound_Interest {
    public static void main(String[] arg){
        System.out.print("What is the principal amount? ");
        Scanner principalInp = new Scanner(System.in);
        double principal = principalInp.nextDouble();

        System.out.print("What is the percentage rate? ");
        Scanner rateInp = new Scanner(System.in);
        double rate = rateInp.nextDouble();
        double percentage = rate/100;

        System.out.print("What is the number of years? ");
        Scanner yearsInp = new Scanner(System.in);
        double years = yearsInp.nextInt();

        System.out.print("What is the number of times that interest is compounded per year? ");
        Scanner compRateInp = new Scanner(System.in);
        double compRate = compRateInp.nextDouble();
        double subtotal1 = (1+(rate/100)/compRate);
        double subtotal2 = (years*compRate);



        double total = Math.pow( subtotal1, subtotal2);
        double subtotal3 = total * principal;



        System.out.printf("%.0f is invested at %.2f%% for %.0f years compounded %.0f times per year is $%.2f.", principal, rate, years, compRate,subtotal3);



    }
}
