/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bata
 */
public class totaltime {
   public static void main(String[] args) {
        // Constants
        int totalDistance = 10000;  // Distance from Kampala to Kabale in kilometers
        int passengerStopDistance = 150;  // Stop for passengers every 150 km
        int refuelStopDistance = 200;  // Stop for refueling every 200 km
        int trainSpeed = 250;  // Train speed in km/h
        int stopTimeMinutes = 5;  // Time taken for each stop in minutes

        // Calculate total time without stops
        double travelTimeWithoutStops = (double) totalDistance / trainSpeed;

        // Calculate number of stops for passengers
        int passengerStops = totalDistance / passengerStopDistance;

        // Calculate number of stops for refueling
        int refuelStops = totalDistance / refuelStopDistance;

        // Calculate the total number of stops (overlapping stops counted only once)
        int totalStops = passengerStops + refuelStops - (totalDistance / (passengerStopDistance * refuelStopDistance));

        // Calculate total stop time in hours (5 minutes per stop)
        double totalStopTimeHours = (totalStops * stopTimeMinutes) / 60.0;

        // Calculate total travel time (including stops)
        double totalTravelTime = travelTimeWithoutStops + totalStopTimeHours;

        // Display the results
        System.out.printf("Total travel time from Kampala to Kabale is: %.2f hours\n", totalTravelTime);
    }  
}
