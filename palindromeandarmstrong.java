import java.util.Scanner;
public class palindromeandarmstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            sum+=digit*digit*digit;
            temp/=10;
        }
        System.out.println(rev==n? "Palindrome":"Not Palindrome");
        System.out.println(sum==n?"Armstrong":"Not ArmStrong");
    }
}
