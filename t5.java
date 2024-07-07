import java.util.Scanner;

public class t5{
    public static String revString(String s){
        return new StringBuilder(s).reverse().toString();

    }
    public static void main(String args[]){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter a string");
        String input =d.nextLine();
        System.out.println("REv string " + revString(input));
    }
}
