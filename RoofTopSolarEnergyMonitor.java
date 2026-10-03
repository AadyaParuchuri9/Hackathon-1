import java.util.Scanner;

public class RoofTopSolarEnergyMonitor {

    
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ------------------------------------------------------------
        // Part 2a: Data Types & Basic Storage
        // ------------------------------------------------------------
        System.out.println("=== 2a) Storing and Displaying Initial System Details ===");
        
                int panelId = 4502;
        double initialEnergyGenerated = 8.5; // Initial hardcoded decimal value
        int numberOfPanels = 16;
        char systemStatus = 'O'; // 'O' for Operational, 'M' for Maintenance

        
        System.out.println("Panel ID: " + panelId);
        System.out.println("Initial Energy Generated: " + initialEnergyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
        System.out.println(); // Blank line for separation


        // ------------------------------------------------------------
        // Part 2c: Methods (Calculating Total Energy from User Input)
        // ------------------------------------------------------------
        System.out.println("=== 2c) Calculating Total Energy (Using Methods) ===");
        
                System.out.print("Enter morning energy generation (kWh): ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy generation (kWh): ");
        double evening = scanner.nextDouble();

                double totalEnergy = calculateTotalEnergy(morning, evening);
        System.out.println("Total energy calculated by method: " + totalEnergy + " kWh");
        System.out.println();


        // ------------------------------------------------------------
        // Part 2b: If-Else Condition (Monitoring performance of total energy)
        // ------------------------------------------------------------
        System.out.println("=== 2b) Monitoring Performance (If-Else Condition) ===");
        
                if (totalEnergy >= 10.0) {
            System.out.println("Status Report: Good Energy Generation");
        } else {
            System.out.println("Status Report: Low Energy Generation");
        }

                scanner.close();
    }
}