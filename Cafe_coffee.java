import java.sql.SQLOutput;
import java.util.*;
public class Cafe_coffee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("PLease enter a coffee type: ");
        String type=sc.nextLine();

        System.out.print("enter quantity: ");
        int quantity=sc.nextInt();

        int price = 0;
        float  GST_RATE = 0.12f;

        switch(type) {
            case "espresso":
                price = 120;
                break;
            case "latte":
                price = 150;
                break;
            case "cappuccino":
                price = 130;
                break;
            case "Americano":
                price = 190;
                break;
        }
        int total=price*quantity;
        System.out.println(total);
        float sub_total=total*GST_RATE+total;
        System.out.println(sub_total);
        System.out.print("exit");
    }
}




















//import java.util.Scanner;
//
//public class CoffeeCounterChronicles {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String coffeeType;
//        int quantity;
//        double price = 0;
//        final double GST_RATE = 0.18;
//
//        System.out.println("☕ Welcome to Ravi's Café ☕");
//
//        while (true) {
//            System.out.print("\nEnter coffee type (espresso / latte / cappuccino / exit): ");
//            coffeeType = sc.nextLine().toLowerCase();
//
//            if (coffeeType.equals("exit")) {
//                System.out.println("Thank you for visiting Ravi's Café!");
//                break;
//            }
//
//            System.out.print("Enter quantity: ");
//            quantity = sc.nextInt();
//            sc.nextLine(); // consume the leftover newline
//
//            switch (coffeeType) {
//                case "espresso":
//                    price = 120;
//                    break;
//                case "latte":
//                    price = 150;
//                    break;
//                case "cappuccino":
//                    price = 130;
//                    break;
//                default:
//                    System.out.println("Invalid coffee type. Please try again.");
//                    continue;
//            }
//
//            double total = price * quantity;
//            double gst = total * GST_RATE;
//            double finalBill = total + gst;
//
//            System.out.println("Subtotal: ₹" + total);
//            System.out.println("GST (18%): ₹" + gst);
//            System.out.println("Total Bill: ₹" + finalBill);
//        }
//
//        sc.close();
//    }
//}
