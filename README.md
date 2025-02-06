# Pico y Placa Predictor 

This is a Java-based "Pico y Placa" predictor that determines whether a car can be on the road based on its license plate number, date, and time.

## Features
* Validates car restrictions based on the last digit of the license plate.
* Checks if the given time match within restricted hours.
* Checks if the last digit match within restricted day of the week.

## Setup & Installation
Prerequisites:
* Java 17 or later.
* Java extension.

Clone the Repository:
  * git clone https://github.com/Samuel1905/Pico-y-placa-predictor.git
  * cd pico-y-placa

If you use an IDE:
  * Open a new project and select the pom.xml file.
  * Wait for the IDE to load dependencies.
    
If you use an another tool, make sure you have a java extension installed.

## Usage
In the source package you can find the "PicoYPlaca.java" file which contains the logic to resolve this problem. And the "PicoyPlacaPredictor.java" file, which determines if a car can be on the road. 
In this file make sure to set a license plate, date and time in the main function.

Example:

... main {
   String licensePlate = "PBX-123";
        String date = "2025-02-03"; // A Monday
        String time = "19:29";
        
        PicoYPlaca checker = new PicoYPlaca(licensePlate, date, time);

        System.out.println("Can the car be on the road? \n" + 
                (checker.canBeOntheRoad()? "Yes" : "No"));
... }
 
Notice: 
* License Plate must be in a complete format. Examples: "PBX-123" or "PBE-3245".
* License Plabe must not be formatted like: "123-BFS" or "PFS-123C" or any other incorrect combination. 
* Date format must be: "yyyy-MM-dd". Example: "2024-05-12"
* Time Format must be: "HH:mm". Example: "07:20" or "19:30"

Then you can run the file containing the main function to check whether a car can be on the road in an specific date or time.

## Tests

Finally, you can have the file "PicoYPlacaNGTest.java" located in the test package, wich have the test cases. I use TestNG, a typical testing framework in java.
Which is very usefull to do unit tests.

This file have test cases to ensure the code works correctly.

Test Cases:
* If a car can be on the road. (With testCanOntheRoad_Allowed)
* If a car can't be on the road. (With testCanOntheRoad_Restricted)



