package com.mycompany.picoyplacapredictor;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class PicoYPlaca {

    //atributes
    private int lastDigit;
    private LocalDate date;
    private LocalTime time;

    // Constructor 
    public PicoYPlaca(String licensePlate, String dateStr, String timeStr) {
        this.lastDigit = Character.getNumericValue(licensePlate.charAt(licensePlate.length() - 1));
        this.date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.time = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm"));
    }

    // Methods
    // Method to check if a car can be on the road
    public boolean canBeOntheRoad() {
        if (isRestrictedDate() && isRestrictedTime()){
            return false;
        }
        return true;
    }

    // Method to check restricted day of the week
    private boolean isRestrictedDate() {
        DayOfWeek dayofWeek = date.getDayOfWeek();

        return switch (dayofWeek) {
            case MONDAY ->
                (lastDigit == 1 || lastDigit == 2);
            case TUESDAY ->
                (lastDigit == 3 || lastDigit == 4);
            case WEDNESDAY ->
                (lastDigit == 5 || lastDigit == 6);
            case THURSDAY ->
                (lastDigit == 7 || lastDigit == 8);
            case FRIDAY ->
                (lastDigit == 9 || lastDigit == 0);
            default ->
                false;
        };
    }

    // Method to check restricted time
    private boolean isRestrictedTime() {
        return (time.isAfter(LocalTime.of(6, 59)) && time.isBefore(LocalTime.of(9, 31)))
                || (time.isAfter(LocalTime.of(15, 59)) && time.isBefore(LocalTime.of(19, 31)));
    }

}
