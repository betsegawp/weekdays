import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 0;

        System.out.println("Enter the week day number: ");
        day=input.nextInt();

        switch (day) {

            case 1:
                System.out.println("it is sunday");
                break;
            case 2:
                System.out.println("It is monday");
                break;
            case 3:
                System.out.println("It is tuesday");
                break;
            case 4:
                System.out.println("It is wednesday");
                break;
            case 5:
                System.out.println(" It is Thrusday");
                break;
            default:
                System.out.println("It is Friday");


                }
        }
    }


