
import org.junit.Assert;
import org.junit.Test;

public class MyDateTest {
    @Test
    public void MyDateCorrectDateTest() {
        MyDate myDate;
        // First check: a valid date from a leap year
        try {
            myDate = new MyDate(12, 2, 2000);
        }
        catch (Exception ex) {
            Assert.fail();
        }

        // Second check: if it's a leap year, then the date is still valid
        try {
            myDate = new MyDate(12, 2, 2000);
            myDate.setDay(29);
        }
        catch(Exception ex) {
            Assert.fail();
        }
    }

    @Test
    public void MyDateNotALeapYear() {
        MyDate myDate;
        // This test will be successful if an exception is thrown
        try {
            myDate = new MyDate(29, 2, 2001);
        }
        catch (IllegalArgumentException ex) {
            return;
        }
        Assert.fail();
    }

    @Test
    public void MyDateInvalidDayChange() {
        MyDate myDate;
        // This test will be successful if an exception is thrown
        try {
            myDate = new MyDate(31, 3, 2023);
            myDate.setMonth(4);
        }
        catch (IllegalArgumentException ex) {
            return;
        }
        Assert.fail();
    }

    @Test
    public void MyDateInvalidDayChange2() {
        MyDate myDate;
        // This test will be successful if an exception is thrown
        try {
            myDate = new MyDate(29, 3, 2023);
            myDate.setMonth(2);
        }
        catch (IllegalArgumentException ex) {
            return;
        }
        Assert.fail();
    }

    @Test
    public void MyDateInvalidYearChange() {
        MyDate myDate;
        // This test will be successful if an exception is thrown
        try {
            myDate = new MyDate(29, 2, 2020);
            myDate.setYear(2023);
        }
        catch (IllegalArgumentException ex) {
            return;
        }
        Assert.fail();
    }
}

