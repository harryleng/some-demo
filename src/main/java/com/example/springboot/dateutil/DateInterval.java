package com.example.springboot.dateutil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/9/20
 */
public class DateInterval
{

    public static Age getAge(Date birthday,Date desDay){

        if (birthday == null || desDay == null) {
            throw new IllegalArgumentException("The birthday and desDay must not be null");
        }

        Calendar bCalendar = createCalendar(birthday);

        Calendar dCalendar = createCalendar(desDay);

        int day=dCalendar.get(Calendar.DAY_OF_MONTH)-bCalendar.get(Calendar
                .DAY_OF_MONTH);

        int month=dCalendar.get(Calendar.MONTH)-bCalendar.get(Calendar
                .MONTH);

        int year=dCalendar.get(Calendar.YEAR)-bCalendar.get(Calendar
                .YEAR);

        if (day < 0){
            month --;
            dCalendar.add(Calendar.MONTH,-1);
            day+=dCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        if (month <0){
            year --;
            dCalendar.add(Calendar.YEAR,-1);
            month = (month + 12) % 12;
        }

        return new Age(year,month,day);
    }


    private static Calendar createCalendar(Date date){
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance;
    }

   private static final class  Age{
       private int year;

       private int month;

       private int day;

       public Age(int year, int month, int day)
       {
           this.year = year;
           this.month = month;
           this.day = day;
       }

       public int getYear()
       {
           return year;
       }

       public void setYear(int year)
       {
           this.year = year;
       }

       public int getMonth()
       {
           return month;
       }

       public void setMonth(int month)
       {
           this.month = month;
       }

       public int getDay()
       {
           return day;
       }

       public void setDay(int day)
       {
           this.day = day;
       }

       @Override
       public String toString() {
           return new StringBuilder().append(year).append("岁").append(month).append("个月").append(day).append("天")
                   .toString();
       }
   }
}
