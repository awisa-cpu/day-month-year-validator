package com.company;
import java.util.Scanner;

public class Date_Tester{

    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);

    System.out.print("Day: ");
    int take_day=input.nextInt();
    System.out.print("Month: ");
    int take_month=input.nextInt();
    System.out.print("Year: ");
    int take_year=input.nextInt();

	Date new_date=new Date(take_day,take_month,take_year);//constructor method to assign values to private data

    new_date.displayDate();



    }


}
