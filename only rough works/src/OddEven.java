import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number= sc.nextInt();
        if (number%2==0){
            System.out.println("its an even number");

        }
        else {
            System.out.println("its a odd number");
        }
    }
}