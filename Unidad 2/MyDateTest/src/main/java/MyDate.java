public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("The date is not valid");
        }
        this.day = day;
        this.month = month;
        this.year = year;
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

    public void setDay(int day) {
        if (!isValidDate(day, this.month, this.year)) {
            throw new IllegalArgumentException("The day is not valid");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (!isValidDate(this.day, month, this.year)) {
            throw new IllegalArgumentException("The month is not valid");
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (!isValidDate(this.day, this.month, year)) {
            throw new IllegalArgumentException("The year is not valid");
        }
        this.year = year;
    }

    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
