package DataStructures.Arrays;

/* .......... Reverse A String .......... */
// create a function that reverse a string:
// example: "Hello World" becomes "dlroW olleH"

public class ReverseAString {

    public static String reverse(String text) {

        // What if input was something unexpected?
        if (!(text instanceof String)) {
            System.out.println("input is NOT String");
            return "";
        }
        else if (text.length() < 2) {
            return text;
        }

        // 1st method
//        String reversedOutput = "";
//        for(int i=0; i<args.length(); i++) {
//            System.out.println(args.charAt(i));
//            reversedOutput=args.charAt(i) + reversedOutput;
//        }
//        return reversedOutput;

        // 2nd method
//        String reversedOutput = "";
//        for(int i=text.length()-1; i>=0; i--) {
//            System.out.println(text.charAt(i));
//            reversedOutput+=text.charAt(i);
//        }
//        return reversedOutput;

        // 3rd method: using StringBuilder
        StringBuilder reversedOutput = new StringBuilder();
        for (int i=text.length()-1; i>=0; i--) {
            reversedOutput.append(text.charAt(i));
        }
        return reversedOutput.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverse("Hello world!"));

        return;
    }
}
