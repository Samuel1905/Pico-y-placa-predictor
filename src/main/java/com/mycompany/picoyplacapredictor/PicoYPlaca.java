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
    // Nethods
    public boolean PicoYPlaca(String licensePlate, String dateStr, String timeStr) {
        int lastDigit = Character.getNumericValue(licensePlate.charAt(licensePlate.length() - 1));
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalTime time = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm"));
        
        if (isRestrictedDate(lastDigit, date) && isRestrictedTime(time)) {
            return false;
        }
        return true;
    }
    
    private boolean isRestrictedDate(int lastDigit, LocalDate date) {
        DayOfWeek dayofWeek = date.getDayOfWeek();
        boolean canDrive = false;
        
        switch (dayofWeek) {
            case MONDAY -> {
                 if(lastDigit == 1 || lastDigit == 2){
                     canDrive = true;
                 } 
            }
            case TUESDAY -> {
                if (lastDigit == 3 || lastDigit == 4) {
                    canDrive = true;
                }
            }
            case WEDNESDAY -> {
                if (lastDigit == 5 || lastDigit == 6) {
                    canDrive = true;
                }
            }
            case THURSDAY -> {
                if (lastDigit == 7 || lastDigit == 8) {
                    canDrive = true;
                }
            }
            case FRIDAY -> {
                if (lastDigit == 9 || lastDigit == 0) {
                    canDrive = true;
                }
            }
        }
        return canDrive;
    }
    
    
}
