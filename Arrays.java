 import java.util.Scanner;
 class Arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        int min;
        int max;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        min=max=a[0];
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(a[i]<min)min=a[i];
            if(a[i]>max)max=a[i];
            System.out.println("Minimum:" +min);
            System.out.println("Maxium:" +max);
            System.out.println("Average:" +(double)sum/n);
        }
    }
 }
