import java.util.Scanner;

public class BirthMonth {
    public static String error;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your month");
        String trash = scanner.nextLine();
        try{
            int month = Integer.parseInt(trash);
            if (month <= 12 && month > 0){
                System.out.println("your month is " + month);
            }else{
                error = "Out of range";
                throw new Exception("out of range");
            }
        }catch(Exception e){
            System.out.println("Bad input for month: " + trash + ' ' + error);
        }
    }
}
