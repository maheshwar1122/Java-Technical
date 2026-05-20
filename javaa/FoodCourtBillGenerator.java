import java.util.Scanner;
 
public class FoodCourtBillGenerator {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int total = 0;
        int choice;
        char continueOrder;
 
        System.out.println("================================================");
        System.out.println("        WELCOME TO SPICY FOOD COURT");
        System.out.println("================================================");
 
        do {
 
            // Restaurant Menu
            System.out.println("\n**************** MENU CARD ****************");
            System.out.println("1. Chicken Biryani      - Rs.250");
            System.out.println("2. Veg Fried Rice       - Rs.180");
            System.out.println("3. Paneer Butter Masala - Rs.220");
            System.out.println("4. Butter Naan          - Rs.40");
            System.out.println("5. French Fries         - Rs.120");
            System.out.println("6. Chocolate Milkshake  - Rs.150");
            System.out.println("7. Ice Cream            - Rs.90");
            System.out.println("*******************************************");
 
            // User Input
            System.out.print("\nSelect Your Food Item Number: ");
            choice = sc.nextInt();
 
            // Food Selection
            switch (choice) {
 
                case 1:
                    System.out.println("Chicken Biryani added to your order.");
                    total += 250;
                    break;
 
                case 2:
                    System.out.println("Veg Fried Rice added to your order.");
                    total += 180;
                    break;
 
                case 3:
                    System.out.println("Paneer Butter Masala added to your order.");
                    total += 220;
                    break;
 
                case 4:
                    System.out.println("Butter Naan added to your order.");
                    total += 40;
                    break;
 
                case 5:
                    System.out.println("French Fries added to your order.");
                    total += 120;
                    break;
 
                case 6:
                    System.out.println("Chocolate Milkshake added to your order.");
                    total += 150;
                    break;
 
                case 7:
                    System.out.println("Ice Cream added to your order.");
                    total += 90;
                    break;
 
                default:
                    System.out.println("Invalid Item Selected!");
            }
 
            // Continue Ordering
            System.out.print("\nDo you want to order anything else? (Y/N): ");
            continueOrder = sc.next().charAt(0);
 
        } while (continueOrder == 'Y' || continueOrder == 'y');
 
        // Final Bill
        System.out.println("\n================================================");
        System.out.println("                 FINAL BILL");
        System.out.println("================================================");
        System.out.println("Total Amount To Pay : Rs." + total);
        System.out.println("================================================");
 
        System.out.println("\nThank You For Visiting SPICY FOOD COURT 😊");
        System.out.println("Please Visit Again!");
 
        sc.close();
    }
}