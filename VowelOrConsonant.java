package Practice;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char Alphabets = 'b';

        switch (Alphabets) {
            case 'a' :
                System.out.println("Alphabet is vowel");
                break;
            case 'b' :
                System.out.println("Alphabet is consonant");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
