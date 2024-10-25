package scanner.ej4;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month. Must be between 1 and 12.");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || day > daysInMonth()) {
            throw new IllegalArgumentException("Invalid day for the given month and year.");
        }
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
        if (isLeapYear()) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    private int daysInMonth() {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                return 31;
        }
    }

    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
