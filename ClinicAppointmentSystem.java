
/*you are tasked with creating a basic appointment system for a clinic where patients can book appointments with dermatologists. 
Each dermatologist can have multiple appointments in a day.

Write a simple Java program that:
1.Uses an ArrayList to store appointment times for a dermatologist 
2.Uses a Hashmap to store multiple dermatologists, where each dermatologist is mapped to their list of appointments.
3. Allows bookings an appointment for a dermatologist by adding the appointment time to the ArrayList associated with the dermatologist in the Hashmap.
4. Implements a check to see if a specific time is already booked for a dermatologist. if it is, display a message saying the time is unavailable; otherwise, book the appointment */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ClinicAppointmentSystem {

    // HashMap to store dermatologists and their list of appointments
    private HashMap<String, ArrayList<String>> dermatologistAppointments;

    // Constructor to initialize the HashMap
    public ClinicAppointmentSystem() {
        dermatologistAppointments = new HashMap<>();
    }

    // Method to book an appointment
    public void bookAppointment(String dermatologist, String time) {
        // Check if the dermatologist already exists in the HashMap
        if (!dermatologistAppointments.containsKey(dermatologist)) {
            // If not, create a new entry for this dermatologist with an empty list of
            // appointments
            dermatologistAppointments.put(dermatologist, new ArrayList<>());
        }

        // Get the list of appointments for the dermatologist
        ArrayList<String> appointments = dermatologistAppointments.get(dermatologist);

        // Check if the time is already booked
        if (appointments.contains(time)) {
            System.out.println("Time " + time + " is already booked for Dr. " + dermatologist);
        } else {
            // Book the appointment by adding the time to the dermatologist's list
            appointments.add(time);
            System.out.println("Appointment booked with Dr. " + dermatologist + " at " + time);
        }
    }

    // Main method to simulate the booking system
    public static void main(String[] args) {
        ClinicAppointmentSystem system = new ClinicAppointmentSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the name of the dermatologist: ");
            String dermatologist = scanner.nextLine();

            System.out.println("Enter the time for the appointment (e.g., 10:00 AM): ");
            String time = scanner.nextLine();

            // Book the appointment
            system.bookAppointment(dermatologist, time);

            System.out.println("Do you want to book another appointment? (yes/no): ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
