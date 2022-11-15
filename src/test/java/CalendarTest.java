import jdk.jfr.Description;
import org.example.Calendar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalendarTest {

    @Test
    @Description("Return FALSE when year smaller than 1000 or larger than 10000")
    void isLeapYear_01(){
         assertFalse( Calendar.isLeapYear(999));
    }

    @Test
    @Description("Return FALSE when year couldn't divided by 4")
    void isLeapYear_02()   {
        boolean isLeapYear = Calendar.isLeapYear(1203);
        assertFalse(isLeapYear);
    }

    @Test
    @Description("Return TRUE (normal case)")
    void isLeapYear_03()  {
        boolean isLeapYear = Calendar.isLeapYear(1204);
        assertTrue(isLeapYear);
    }

    @Test
    @Description("Return TRUE when year divided by 100 and 400 ")
    void isLeapYear_04()  {
        boolean isLeapYear = Calendar.isLeapYear(1200);
        assertTrue(isLeapYear);
    }

    @Test
    @Description("Return FALSE when year divided by 100 but not by 400 ")
    void isLeapYear_05(){
        boolean isLeapYear = Calendar.isLeapYear(1300);;
        assertFalse(isLeapYear);
    }



    @Test
    @Description("Abnormal case, leap year, day = 29, month = February")
    void isDayValid_01()   {
        boolean isDayValid = Calendar.isValidDate(2004, 2, 29);
        assertTrue(isDayValid);
    }

    @Test
    @Description("Normal case ")
    void isDayValid_02(){
        boolean isValid = Calendar.isValidDate(2001, 1,1);
        assertTrue(isValid);
    }

    @Test
    @Description("Normal case")
    void isDayValid_03(){
        boolean isValid = Calendar.isValidDate(2001,  1, 0);
        assertFalse(isValid);
    }

    @Test()
    void isDayValid_04(){
        boolean isValid = Calendar.isValidDate(2001, 1,32);
        assertFalse(isValid);
    }

    @Test()
    void isDayValid_05(){
        boolean isValid = Calendar.isValidDate(2001, 0, 12);
        assertFalse(isValid);
    }

}
