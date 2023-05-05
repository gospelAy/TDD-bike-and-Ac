import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike bike;
    @BeforeEach
    void setUp() {
        bike = new Bike();
    }
    @Test
    public void testThatObjectBikeExist(){
        assertNotNull(bike);
    }
    @Test
    public void testThatBikeCanBeTurnedOn(){
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
    }
    @Test
    public void testThatBikeCanBeTurnedOff() {
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        assertFalse(bike.isOn());
    }
    @Test
    public void testThatBikeCanBeAccelerated(){
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.gear1();
        assertEquals(16, bike.getAccelerate());
//        bike.increment();
//        assertEquals(1, bike.getAccelerate());
    }
    @Test
    public void testGear2(){
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.gear2();
        assertEquals(17, bike.getAccelerate());

    }
    @Test
    public void testGear3(){
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.gear3();
        assertEquals(18, bike.getAccelerate());
    }
    @Test
    public void testGear4(){
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.gear4();
        assertEquals(19, bike.getAccelerate());
    }
}