import java.util.Scanner;
public class zadacha6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayofWeek = sc.nextInt();
        switch (dayofWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Mistake");
                break;
        }
    }
}
