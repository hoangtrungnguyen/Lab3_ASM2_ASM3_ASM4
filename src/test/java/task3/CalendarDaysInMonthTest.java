package task3;

import org.example.Calendar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendarDaysInMonthTest {

    @Test
    void daysInMonth_01(){
        int days = Calendar.daysInMonth(2000, 1);
        assertEquals(31, days);
    }

    @Test
    void daysInMonth_02(){
        int days = Calendar.daysInMonth(2000, 4);
        assertEquals(30, days);
    }

    @Test
    void daysInMonth_03(){
        int days = Calendar.daysInMonth(2000, 2);
        assertEquals(29, days);
    }

    @Test
    void daysInMonth_04(){
        int days = Calendar.daysInMonth(2004, 2);
        assertEquals(29, days);
    }

    @Test
    void daysInMonth_05(){
        int days = Calendar.daysInMonth(2100, 2);
        assertEquals(28, days);
    }

    @Test
    void daysInMonth_06(){
        int days = Calendar.daysInMonth(2001, 2);
        assertEquals(28, days);
    }

    @Test
    void daysInMonth_07(){
        int days = Calendar.daysInMonth(2000, 0);
        assertEquals(0, days);
    }
}
