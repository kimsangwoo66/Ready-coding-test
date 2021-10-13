package Java_algolizm.Ict;

import java.util.Scanner;

public class makeOne {
    public static int[] arr = new int[300001];
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=2; i<=x;i++)
        {
            arr[i] = arr[i-1] + 1;

            if(i%2==0)
                arr[i] = Math.min(arr[i],arr[i/2]+1);

            if(i%3==0)
                arr[i] = Math.min(arr[i],arr[i/3]+1);

            if(i%5==0)
                arr[i]= Math.min(arr[i], arr[i/5]+1);


        }
        System.out.println(arr[x]);

    }
}
