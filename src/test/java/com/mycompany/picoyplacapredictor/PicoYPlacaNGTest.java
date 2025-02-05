package com.mycompany.picoyplacapredictor;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 *
 * @author User
 */
public class PicoYPlacaNGTest {
    
    @Test
    public void testCanBeOntheRoad_Restricted() {
        String licensePlate = "PBX-121";
        String date = "2025-02-03"; // Monday
        String time = "19:29";
        boolean expected = false;
        
        PicoYPlaca checker = new PicoYPlaca(licensePlate, date, time);
        // Checking if the car can be on the road
        boolean result = checker.canBeOntheRoad();
        assertEquals(result, expected, "The car can't be on the road");
    }
    
    @Test
    public void testCanBeOntheRoad_Allowed() {
        String licensePlate = "PBX-123";
        String date = "2025-02-05"; // Wednesday
        String time = "10:00";
        boolean expected = true;

        PicoYPlaca checker = new PicoYPlaca(licensePlate, date, time);

        //Checking if the car can be on the road
        boolean result = checker.canBeOntheRoad();
        assertEquals(result, expected, "The car can be on the road");
    }
    
}
