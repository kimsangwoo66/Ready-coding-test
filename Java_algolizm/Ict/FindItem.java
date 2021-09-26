package Java_algolizm.Ict;
/*
* 입력예시
* 5
* 8 3 7 9 2
* 3
* 5 7 9
* */

/*
* 출력예시
* no yes yes
* */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindItem {

    public static int BS(int arr[], int target, int start, int end)
    {
        while (end>=start)
        {
            int mid = (start + end) / 2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end= mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []storeItem = new int[n];
        for(int i=0;i<n;i++)
        {
            storeItem[i]=sc.nextInt();
        }

        Arrays.sort(storeItem);


        int m = sc.nextInt();
        int []requestItem = new int[m];

        for (int i=0; i<m;i++)
        {
            requestItem[i]=sc.nextInt();
        }

        for (int i =0;i<m;i++) {
            int result = BS(storeItem,requestItem[i],0,n-1);
            if(result == -1)
            {
                System.out.print("no ");
            }
            else
            {
                System.out.print("yes ");
            }



        }
        for (int i1 : requestItem) {
            System.out.println(i1);
        }

    }

}
