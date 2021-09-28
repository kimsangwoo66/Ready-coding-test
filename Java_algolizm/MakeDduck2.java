package Java_algolizm;

import java.util.Arrays;
import java.util.Scanner;


/*
* 입력예시
* 4 6
* 19 15 10 17
* */
public class MakeDduck2 {
    //mid의 값을 최적화 시켜 가면서 손님이 원하는 떡의 길이를 찾는다.
    /**
    * @param arr 떡들의 집합
    * @param target 손님이 원하는 떡의 길이
     * @param end 최적값을 찾기위한 끝점
     * @param start 시작점
    * */
    public static int BS(int arr[], int target, int start, int end){

        int result = 0;

        while (start<=end)
        {
            int mid = (start+end)/2;
            int total = 0;


            for(int i=0; i<arr.length;i++)
            {
                if(mid<arr[i])
                {
                    total+=arr[i]-mid;
                }
            }
            //  절삭기로 자른 떡들의 합  > 손님이 원하는 떡의 길이
            if(total>=target)
            {
                result=mid;
                start = mid +1;
            }
            else{
                end = mid -1;

            }
        }
        return result;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int []dduck = new int[n];

        for (int i=0;i<n;i++)
        {
            dduck[i]=sc.nextInt();
        }
        Arrays.sort(dduck);

        int answer = BS(dduck, m, 0, (int)1e9);

        System.out.println(answer);
    }

}
