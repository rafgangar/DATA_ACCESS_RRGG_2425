package activities33.ej3;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // Setter for month with validation
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month. Must be between 1 and 12.");
        }
        this.month = month;
    }

    // Setter for day with validation based on month
    public void setDay(int day) {
        if (day < 1 || day > daysInMonth()) {
            throw new IllegalArgumentException("Invalid day for the given month.");
        }
        this.day = day;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Method to determine the number of days in the month
    private int daysInMonth() {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; // Assuming non-leap year
            default:
                return 31;
        }
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

