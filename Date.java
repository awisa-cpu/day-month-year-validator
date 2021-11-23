package com.company;

public class Date {
    private int day_date;
    private int month_date;
    private int year_date;

    public Date(int day, int month, int year)
    {
        day_date=day;
        if(month>0 && month<=12)
        {
            month_date=month;
        }else
        {
            month_date=1;
        }
        year_date=year;
    }

    public void displayDate()
    {
        System.out.println("Day:Month:Year\n"+day_date+"/"+month_date+"/"+year_date);
    }
}
