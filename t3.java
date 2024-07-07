import java.util.*;
public class t3 {

    public static String RemoveVowels(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str=str.substring(0, i)+str.substring(i+1 );
                i--;
            }

        }
        return str;
    }
    public static void main(String args[]){
        String str ="take you forward";
        System.out.println("String after removing spaces " + RemoveVowels(str));
    }
    
}