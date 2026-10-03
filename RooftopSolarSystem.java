import java.util.Scanner;

public class RooftopSolarSystem {

    
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- 2a) Data Types ---
        int panelID = 101;                  
        double energyGenerated = 2450.75;   
        int numberOfPanels = 12;            
        char systemStatus = 'A';            

        System.out.println("=== Rooftop Solar System Details ===");
        System.out.println("Panel ID: " + panelID);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        // --- 2b) If-Else Condition ---
        System.out.print("\nEnter energy generated (kWh): ");
        double energy = sc.nextDouble();

        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        // --- 2c) Methods ---
        System.out.print("\nEnter morning energy (kWh): ");
        double morning = sc.nextDouble();

        System.out.print("Enter evening energy (kWh): ");
        double evening = sc.nextDouble();

        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + total + " kWh");

        sc.close();
    }
}
