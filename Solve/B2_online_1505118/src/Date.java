
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Lenovo
 */
public class Date {
    // constants
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int DECEMBER = 12;
    private static final int DAYS_PER_WEEK = 7;
    private static final int DAYS_PER_YEAR = 365;
    private static final int DAYS_PER_LEAP_YEAR = 366;
    private static final String[] DAY_NAMES = {"SUNDAY", "MONDAY", "TUESDAY",
            "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    private static final int[] DAYS_PER_MONTH = {-1,
            //   1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
    };

    // fields
    private int year;
    private int month;
    private int day;

    /**
     * Constructs a new object representing the given year, month, and day.
     *
     * @throws IllegalArgumentException if month is not between 1 and 12, or if day is not between 1 and the number of days in that month.
     */
    public Date(int year, int month, int day) throws Exception {
        this.year = year;
        this.month = month;
        this.day = day;

        if (month < 1 || month > 12 || day < 1 || day > getDaysInMonth()) {
            throw new IllegalArgumentException("Invalid day or month: " + toString());
        }
    }

    /**
     * Constructs a new object representing today's date.
     */
    public Date() throws Exception{
        this(1970, JANUARY, 1);
        int daysSinceEpoch = (int) ((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 1000 / 60 / 60 / 24);
        for (int i = 0; i < daysSinceEpoch; i++) {
            nextDay();
        }
    }

    /**
     * Adds the given number of days to this Date.
     *
     * @throws IllegalArgumentException if days < 0.
     */
    public void addDays(int days) throws Exception {
        if (days < 0) throw new Exception();

        while (days > getDaysInYear()) {
            days -= getDaysInYear();
            year++;
        }

        for (int i = 1; i <= days; i++) {
            nextDay();
        }
    }

    /**
     * Returns whether o refers to a Date object representing the same
     * year, month, and day as this one.
     */
    public boolean equals(Object o) {
        Date other = (Date) o;
        return day == other.day &&
                month == other.month &&
                year == other.year;
    }

    /**
     * Returns the day represented by this Date object.
     *
     * @return the day, between 1 and the number of days in this Date's month
     * (which varies from 28 to 31)
     */
    public int getDay() {
        return day;
    }

    /**
     * Returns the number of days in the month represented by the current Date.
     */
    public int getDaysInMonth() throws Exception {
        int result = DAYS_PER_MONTH[month];
        if (month == FEBRUARY && isLeapYear()) {
            result++;
        }
        return result;
    }

    public int getDaysInYear() throws Exception {
        if (isLeapYear()) {
            return 366;
        } else {
            return 365;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Returns a string such as "Monday" representing what day of the week
     * this Date fell on.
     *
     * @return the day as either "Sunday", "Monday", "Tuesday, "Wednesday", "Thursday", "Friday", or "Saturday"
     */
    public String getDayOfWeek() throws Exception {
        int index = 1;
        Date temp = new Date(1753, JANUARY, 1);
        while (!temp.equals(this)) {
            temp.nextDay();
            index = (index + 1) % DAYS_PER_WEEK;
            if(index < 0) throw new Exception();
        }

        return DAY_NAMES[index];
    }

    /**
     * Returns the month represented by this Date object.
     *
     * @return the month, between 1 and 12
     */
    public int getMonth() {
        return month;
    }

    /**
     * Returns the year represented by this Date object.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns whether this Date falls on a leap year.
     *
     * @return true if in a year divisible by 4 but not by 100 unless by 400
     */
    public boolean isLeapYear() throws Exception {
        if (year < 0) throw new Exception();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            success();
            return true;
        } else return false;

    }

    void success() {
      //  System.out.println("leap year func executed");
    }

    /**
     * Advances this Date to the next day.
     * If necessary, wraps to the next month and/or year.
     */
    public void nextDay() throws Exception {

        day++;
        if (day > getDaysInMonth()) {
            // wrap to next month
            month++;
            day = 1;
            if (month > DECEMBER) {
                // wrap to next year
                year++;
                month = JANUARY;
            }
        }
    }

    /**
     * Returns a String representation of this Date.
     *
     * @return a String such as "2007/07/26" for July 26, 2007
     */
    public String toString() {
        return year + "/" + pad(month) + "/" + pad(day);
    }

    private String pad(int n) {
        if (n < 10) {
            return "0" + n;
        } else {
            return "" + n;
        }
    }
}