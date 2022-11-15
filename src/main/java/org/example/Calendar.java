package org.example;

public class Calendar {

    public static boolean isLeapYear(int year)   {
        if (year > 10000 || year < 1000) {
           return false;
        }

        if (year % 100 == 0) {
            {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }

            }
        } else if ( year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day) {

        if(!(month >= 1 && month <= 12)){
            return false;
        }

        if(day < 1){
            return false;
        }

        if(day <= daysInMonth(year, month)){
            return true;
        } else {
            return false;
        }
    }

    public static int daysInMonth(int year, int month)   {
        if (month == 2) {
             return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}
