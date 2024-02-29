import java.util.Scanner;

public class SquareFoot {
    public static void main(String[] args) {
        int l = 0;
        int h = 0;
        int cost = 0;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Input length");
            l = scanner.nextInt();
        }catch (Exception e){
            System.exit(2);
        }
        try{
            System.out.println("Input height");
            h = scanner.nextInt();
        }catch (Exception e){
            System.exit(2);
        }
        try{
            System.out.println("Input cost per sqaure foot");
            cost = scanner.nextInt();
        }catch (Exception e){
            System.exit(3);
        }
        System.out.println("Your total cost is $" + l * h * cost);
    }
}
