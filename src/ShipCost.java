import java.util.Scanner;

public class ShipCost {
    public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);

            while (true) { //main loop
                try {
                    System.out.println("What is the price of your item?");
                    double price = scan.nextInt();

                    double shipping = (price < 100) ? 0.02 * price : 0;

                    System.out.println("the price of your item is " + price + ' ' + "the shipping on your item is " + shipping + ' ' + "Your total price is " + (shipping + price));
                    break;
                } catch (Exception e) {
                    System.out.println("Enter a valid double");
                    scan.nextLine();
                }
            }
        }
    }
