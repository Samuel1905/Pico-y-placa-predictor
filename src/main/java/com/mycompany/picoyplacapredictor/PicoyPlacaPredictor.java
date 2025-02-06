package com.mycompany.picoyplacapredictor;

/**
 *
 * @author User
 */
public class PicoyPlacaPredictor {

    public static void main(String[] args) {
        String licensePlate = "PBX-123";
        String date = "2025-02-03"; // A Monday
        String time = "19:29";
        
        PicoYPlaca checker = new PicoYPlaca(licensePlate, date, time);

        System.out.println("Can the car be on the road? \n" + 
                (checker.canBeOntheRoad()? "Yes" : "No"));
    }
}
