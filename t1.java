// hard code input
// public class t1 {
//     public static void main(String args[]){
//         char ch='a';
//         int ascii=ch;

//         System.out.println("the ascii vale of " + ch + " is " + ascii);
//     }
    
// }
// taking input from user

import java.util.Scanner;

public class t1 {
    public static int asciiValue(char ch){
        return (int)ch;
    }
    public static void main(String args[]){
        Scanner d =new Scanner(System.in);
        System.out.println("Enter a character : ");
        char inputChar= d.next().charAt(0);

        System.out.println("the ascii is "+ asciiValue(inputChar));
    }
    
}

