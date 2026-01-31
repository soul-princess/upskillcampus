import java.util.Scanner;

class AgriPreneur {
    String name;
    String cropType;
    String location;
    double investment;

    AgriPreneur(String name, String cropType, String location, double investment) {
        this.name = name;
        this.cropType = cropType;
        this.location = location;
        this.investment = investment;
    }

    void displayDetails() {
        System.out.println("\n--- AgriPreneur Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Crop Type  : " + cropType);
        System.out.println("Location   : " + location);
        System.out.println("Investment : ₹" + investment);
    }
}

public class AgriPreneurSupportNetwork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgriPreneur agri = null;
        int choice;

        System.out.println("===== Welcome to AgriPreneur Support Network =====");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Register AgriPreneur");
            System.out.println("2. View AgriPreneur Details");
            System.out.println("3. Government Scheme Support");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Crop Type: ");
                    String crop = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter Investment Amount: ");
                    double investment = sc.nextDouble();

                    agri = new AgriPreneur(name, crop, location, investment);
                    System.out.println("AgriPreneur registered successfully!");
                    break;

                case 2:
                    if (agri != null) {
                        agri.displayDetails();
                    } else {
                        System.out.println("No AgriPreneur registered yet.");
                    }
                    break;

                case 3:
                    System.out.println("\nAvailable Government Support Schemes:");
                    System.out.println("- PMFBY (Crop Insurance)");
                    System.out.println("- PMKSY (Irrigation Scheme)");
                    System.out.println("- Kisan Credit Card");
                    System.out.println("- Startup India for Agri Businesses");
                    break;

                case 4:
                    System.out.println("Thank you for using AgriPreneur Support Network.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
