import java.util.Scanner;

public class TypeTeller {
    public static void main(String[] args) {
        System.out.println("what is your number");
        Scanner scan = new Scanner(System.in);
        String variable = scan.nextLine();
        try{
            double d1 = Double.parseDouble(variable);
            try{
                int i1 = Integer.parseInt(variable);
                System.out.println("you have enterd the int " + i1);
            }catch (Exception e){
                System.out.println("You have entered the double " + d1);
            }
        }
        catch (Exception e){
            System.out.println("You have entered the string " + variable);
        }
    }
}
