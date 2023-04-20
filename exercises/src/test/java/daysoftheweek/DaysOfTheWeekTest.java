package daysoftheweek;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DaysOfTheWeekTest {
    @Test
    public void test1(){
        assertEquals("Monday", DaysOfTheWeek.daysOfTheWeek(1));
    }

    @Test
    public void test2(){
        assertEquals("Days like this don't exist", DaysOfTheWeek.daysOfTheWeek(8));
    }

    @Test
    public void test3(){
        assertEquals("Saturday", DaysOfTheWeek.daysOfTheWeek(6));
    }
}
