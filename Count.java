public class Count {
    public void countCharacters(String str) {
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        int digits = 0;
        int specialCharacters = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                spaces++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                specialCharacters++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
    }

    public static void main(String[] args) {
        Count counter = new Count();
        counter.countCharacters("Hello World! 123");
    }
}


