import java.util.Scanner;
public class zadacha4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value a");
        int a = sc.nextInt();
        System.out.println("Input value b");
        double b = sc.nextDouble();
        System.out.println("Input true or false");
        boolean c = sc.nextBoolean();
        boolean Workday = true;
        boolean Dayoff = false;
        if (Workday) {
            System.out.println("I will work");
        }
        if (Dayoff &&  a>0) {
            System.out.println("I will go to cinema");
        }
                else{
                    System.out.println("I will stay at home and watch TV");
        if(Dayoff && a<10){
            System.out.println("Ï will  go for ice cream");
                }
            }
        }
    }
