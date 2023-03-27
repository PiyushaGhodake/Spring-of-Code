import java.util.Scanner;

public class Permute {

	static void printPermutn(String str, String ans)
    {
 
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
           
            char ch = str.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
 
            printPermutn(ros, ans + ch);
        }
    }
 
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.next();
        System.out.println("\nPermutations of given String:");
        printPermutn(s, "");
    }


}
