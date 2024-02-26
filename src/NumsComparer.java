import java.util.Scanner;

public class NumsComparer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            try{
                System.out.printf("What is your first num?");
                int num1 = scan.nextInt();
                System.out.println("What is your second num?");
                int num2 = scan.nextInt();
                if(num1 == num2){
                    System.out.println("your numbers are equal");
                    break;
                }else{
                    System.out.println(num1 > num2 ? num1 + " is greater than " + num2 : num2 + " is greater than " + num1);
                }
                break;
            }catch (Exception e){
                System.out.println("enter an int");
                scan.nextLine();
            }
        }
    }
}
