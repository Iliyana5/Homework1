import java.util.Scanner;
public class zadacha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value a");
        int a = sc.nextInt();
        System.out.println("Input value b");
        int b = sc.nextInt();
        System.out.println("Input value c");
        int c = sc.nextInt();
        a = b;
        b = c;
        c = a;
        int sum = a + b;
        int different = (a + b) - c;
        System.out.println(sum);
        System.out.println(different);
    }
    }
