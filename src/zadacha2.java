import java.util.Scanner;
public class zadacha2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value a");
        int a = sc.nextInt();
        System.out.println("Input value b");
        double b = sc.nextDouble();
        System.out.println("Input value c");
        int c = sc.nextInt();
        System.out.println("Input value d");
        double d = sc.nextDouble();
        a = (int) b;
        c = (int) d;
        System.out.println(b);
        System.out.println(d);
        c = a;
        d = b;
        int sum = (int) (a+b);
        System.out.println(sum);
        c = (int)Math.round(a);
        d = (int)Math.round(b);
        double sum1 = c+d;
        System.out.println(sum1);
    }
    }
