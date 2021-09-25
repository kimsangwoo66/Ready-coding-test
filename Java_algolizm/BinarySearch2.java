package Java_algolizm;

import java.util.Scanner;

public class BinarySearch2
{
    public static int BS(int []arr, int target, int start, int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = (start + end) / 2;

        if(arr[mid] == target)
        {
            return mid;
        }
        else if(arr[mid] > target)
        {
            return BS(arr, target, start, mid-1);
        }

        else
        {
            return BS(arr, target, mid+1, end);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int result = BS(arr, target, 0, n-1);

        if(result == -1)
        {
            System.out.println("타겟값이 존재 하지 않습니다.");
        }
        else
        {
            System.out.println("타겟의 위치는 " + (result+1));
        }
    }
}
