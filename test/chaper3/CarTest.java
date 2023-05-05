package chaper3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void testThatObjectCarExist(){
        Car car1 = new Car("3hc", "2022", 2000.0);
        Car car2 = new Car("model lk2d ", "2019", 2000.0);
        assertNotNull(car1);
        assertNotNull(car2);
    }
    @Test
    public void testThatDiscountCanBeMadeObjectCar1(){
        Car car1 = new Car("3hc", "2022", 2000.0);
        car1.applyDiscount(5);
        assertEquals(1900.0, car1.getPrice());
    }
    @Test
    public void testThatDiscountCanBeMadeObjectCar2(){
        Car car2 = new Car("model lk2d ", "2019", 2000.0);
        car2.applyDiscount(7);
        assertEquals(1860.0, car2.getPrice());
    }
}