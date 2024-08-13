import java.util.Scanner;

class Tollbooth {
    private int totalVehicles;
    private double totalAmount;

    public Tollbooth() {
        this.totalVehicles = 0;
        this.totalAmount = 0.0;
    }

    public void recordVehicle(double tollAmount) {
        totalVehicles++;
        totalAmount += tollAmount;
    }

    public int getTotalVehiclesPassed() {
        return totalVehicles;
    }

    public double getTotalCashCollected() {
        return totalAmount;
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Create an instance of Tollbooth
        Tollbooth tollbooth = new Tollbooth();
        Scanner scanner = new Scanner(System.in);
        char continueToll;

        do {
            System.out.print("Enter the toll amount for the vehicle: ");
            double tollAmount = scanner.nextDouble();
            tollbooth.recordVehicle(tollAmount);

            System.out.print("Do you want to continue (y/n)? ");
            continueToll = scanner.next().charAt(0);
        } while (continueToll == 'y' || continueToll == 'Y');

        // Print the results
        System.out.println("Total vehicles passed: " + tollbooth.getTotalVehiclesPassed());
        System.out.println("Total cash collected: $" + tollbooth.getTotalCashCollected());

        scanner.close();
    }
}