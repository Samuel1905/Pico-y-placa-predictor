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
    
    
}
