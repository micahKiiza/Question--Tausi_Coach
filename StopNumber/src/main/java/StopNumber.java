/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bata
 */
public class StopNumber {
    
    public static void main(String[] args) {
        int totalDistance = 10000;  // Distance from Kampala to Kabale in kilometers
        int passengerStopDistance = 150;  // Stop for passengers every 150 km
        int refuelStopDistance = 200;  // Stop for refueling every 200 km

        // Calculate number of stops for passengers
        int passengerStops = totalDistance / passengerStopDistance;

        // Calculate number of stops for refueling
        int refuelStops = totalDistance / refuelStopDistance;

        // Display the results
        System.out.println("The train will stop " + passengerStops + " times for passengers.");
        System.out.println("The train will stop " + refuelStops + " times for refueling.");
    }
}
