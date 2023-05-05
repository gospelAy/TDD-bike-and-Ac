import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirconditionalTest {

    Airconditional airconditional;
    @BeforeEach
    void setUp() {
        airconditional = new Airconditional();
    }
    @Test
    public void testThatObjectAcExist(){
        assertNotNull(airconditional);
    }
    @Test
    public void testThatAcCanBeTurnedOn(){
        assertFalse(airconditional.isOn());
        airconditional.turnOn();
        assertTrue(airconditional.isOn());
    }
    @Test
    public void testThatAcCanBeTurnedOff(){
        assertFalse(airconditional.isOn());
        airconditional.turnOn();
        assertTrue(airconditional.isOn());
        airconditional.turnOff();
        assertFalse(airconditional.isOn());
    }
    @Test
    public void testThatAcCanBeInCreased(){
        assertFalse(airconditional.isOn());
        airconditional.turnOn();
        airconditional.increaseTemperature();
        assertEquals(17, airconditional.getTemperature());
        airconditional.increaseTemperature();
        assertEquals(18, airconditional.getTemperature());
        airconditional.increaseTemperature();
        assertEquals(19, airconditional.getTemperature());
    }
    @Test
    public void testThatTemperatureCanBeDecreases(){
        assertFalse(airconditional.isOn());
        airconditional.turnOn();
        assertTrue(airconditional.isOn());
        for (int i = 16; i < 18; i++) {
            airconditional.increaseTemperature();
        }
        assertEquals(18, airconditional.getTemperature());
        for (int i = 18; i > 16; i--) {
            airconditional.decreaseTemperature();
        }
        assertEquals(16, airconditional.getTemperature());
    }
    @Test
    public void testThatTemperatureCanNotBeIncreaseBeyond30(){
        assertFalse(airconditional.isOn());
        airconditional.turnOn();
        assertTrue(airconditional.isOn());
        for (int i = 16; i <= 39; i++) {
            airconditional.increaseTemperature();
        }
        assertEquals(30, airconditional.getTemperature());
    }
    @Test
    public void testThatTemperatureCanNotDecreaseBeyond16(){
        assertFalse(airconditional.isOn());
        airconditional.turnOn();
        assertTrue(airconditional.isOn());
        for (int i = 16; i <20 ; i++) {
            airconditional.increaseTemperature();
        }
        assertEquals(20, airconditional.getTemperature());
        for (int i = 20; i > 14; i--) {
            airconditional.decreaseTemperature();
        }
        assertEquals(16, airconditional.getTemperature());
    }
}