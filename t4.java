public class t4 {

    public static String removeChar(String str){
         String s ="";
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>='a' && str.charAt(i)<='z'|| str.charAt(i)>='A' && str.charAt(i)<='Z'){
                s+=str.charAt(i);
            }

        }
        return s;
    }
    public static void main(String args[]){
        String str ="t#ake you$ forwa@rd";
        System.out.println("String after removing characters " + removeChar(str));
    }
    
    
}
