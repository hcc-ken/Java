package Date_Password.utils;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean leapYear () {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean dateCorrect(){
        int maxDays;

        if (year <= 0) return false;
        if (month < 1 || month > 12) return false;
        if (day < 1) return false;

        switch (month) {
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;

            case 2:
                if (leapYear()) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;

            default:
                maxDays = 31;
        }
        // Check that day is within the allowed range for the month
        return day <= maxDays;
    }

    public void nextDay () {
        switch (month) {

            case 4: case 6: case 9: case 11:
                if (day == 30) {
                    day = 1;
                    month += 1;
                } else {
                    day += 1;
                }
                break;

            case 2:
                if (leapYear()) {
                    if (day == 29) {
                        day = 1;
                        month += 1;
                    } else {
                        day += 1;
                    }
                } else {
                    if (day == 28) {
                        day = 1;
                        month += 1;
                    } else {
                        day += 1;
                    }
                }
                break;

            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year += 1;
                } else {
                    day += 1;
                }
                break;

            default:
                if (day == 31) {
                    day = 1;
                    month += 1;
                } else {
                    day += 1;
                }
                break;
        }
    }

    public void print () {
        System.out.println("Day: " + day + " Month: " + month + " Year: " + year);
    }

}
