package TEMPconvertor;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double temperature;
        double convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                if (temperature < -100) {
                    System.out.println("Error: Temperature is too low!");
                } else if (temperature > 100) {
                    System.out.println("Error: Temperature is too high!");
                } else {
                    convertedTemperature = (temperature * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                }
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                if (temperature < -148) {
                    System.out.println("Error: Temperature is too low!");
                } else if (temperature > 212) {
                    System.out.println("Error: Temperature is too high!");
                } else {
                    convertedTemperature = (temperature - 32) * 5 / 9;
                    System.out.println("Temperature in Celsius: " + convertedTemperature);
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
                break;
        }

        scanner.close();
    }
}
