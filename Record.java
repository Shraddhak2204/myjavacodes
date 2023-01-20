import java.util.Scanner;
public class Record {
    public static void main(String[] args){

        Scanner d = new Scanner(System.in);
        System.out.println("enter a number");
        int b = d.nextInt();
        System.out.println("enter a second number");
        int g = d.nextInt();
        int sum=b+g;
        System.out.println("the sum of two numbers is: " +sum);

    }
}
