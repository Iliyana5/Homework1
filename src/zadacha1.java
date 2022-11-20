import java.util.Scanner;
public class zadacha1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Hello");
        int b = sc.nextInt();
        System.out.println("Bye");
        int c = sc.nextInt();
        if (a<c && c<b){
            System.out.println("Bye, Bye");
        }
        else{
            System.out.println("Hi");
        }
        }
    }

