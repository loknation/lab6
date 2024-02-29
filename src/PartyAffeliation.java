import java.util.Scanner;

public class PartyAffeliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What party are you Democrat, Republican or Independant?(R, D, I)");
        char party = scanner.nextLine().charAt(0);
        if (party == 'R'){
            System.out.println("You get repblican elepahnt");
        }else if (party == 'D'){
            System.out.println("You get a democrat donkey");
        }else if (party == 'I'){
            System.out.println("You get an indipendant Person");
        }else{
            System.out.println("You get other");
        }
    }
}
