// Palindrom-Number

// https://leetcode.com/problems/palindrome-number/

package Java.Practiceleet;
public class palindrome {

    public static void main(String[] args) {
        int x = -121;
        boolean result = palindromeno(x);
        System.out.println(result);
    }
    static boolean palindromeno(int x){
        int n = 0;
        int m = Math.abs(x);
        while(x!=0){
            int i = x%10;
            n = n*10+i;
            x=x/10;
        }
        return n==m?true:false;
    }
}
