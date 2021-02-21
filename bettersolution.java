import java.util.*;

class bettersolution{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte gebe ein Wort ein: ");
        String vPalindrom, vReverse;
        vPalindrom = scan.nextLine();
        vPalindrom = vPalindrom.toLowerCase();

        StringBuilder right = new StringBuilder();
         // append a string into StringBuilder input1
        right.append(vPalindrom);
        // reverse StringBuilder input1
        right = right.reverse();
        vReverse = right.toString();
        System.out.println(vReverse);

        if (vReverse == vPalindrom) {
            System.out.println("Palindrom");
        } else {
            System.out.println("kein Palindrom");
        }

        System.out.println(right);


        scan.close();
    }
}