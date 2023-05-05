package chaper3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
    @Test
    public void testThatObjectClockExist() {
        Clock clock = new Clock(1, 12, 16);
        assertNotNull(clock);
    }

    @Test
    public void testDisplayClock() {
        Clock clock = new Clock(25, 61, 61);
        clock.displayTime();
    }


}