package palindrom;
import java.util.*;
public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        str= sc.nextLine();
        System.out.println(isPalindrome(str));

    }
}
