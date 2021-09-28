package Java_algolizm.Ict;

import java.util.Arrays;
import java.util.Scanner;


/*
* 입력예시
* 4 6
* 19 15 10 17
* */
public class MakeDduck {
    //mid의 값을 최적화 시켜 가면서 손님이 원하는 떡의 길이를 찾는다.
    /**
    * @param arr 떡들의 집합
    * @param target 손님이 원하는 떡의 길이
     * @param end 최적값을 찾기위한 끝점
     * @param start 시작점
    * */
    public static int BS(int arr[], int target, int start, int end)
    {
        int result = 0;

        while (start<=end)
        {
            int total = 0; //각 떡들을 절삭기로 자른뒤의 합
            int mid = (start + end) / 2;

            for(int i =0;i<arr.length;i++)
            {
                //절삭기보다 떡의 길이가 긴경우
                if(arr[i]>mid)
                {
                    //잘라진 떡들의 합
                    total+= arr[i]-mid;
                }

            }

            // 잘라진 떡들의 합 < 손님이 원하는 떡의 길이
            if(total<target)
            {

                end = mid -1;
            }
            // 잘라진 떡들의 합 > 손님이 원하는 떡의 길이
            else{

                 result=mid;

                 start=mid+1;
            }


        }

        //이진탐색을 돌려
        // 손님이 원하는 떡의 길이가 나오는 절삭기길이 =mid값을 찾고 반환
        return result;

    }



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //떡의 개수 N
        int N = sc.nextInt();
        int []dducks = new int[N];
        //손님이 요청한 떡의길이 = 절단기로 절단했을때 나오는 떡들의 길이의 합
        int M = sc.nextInt();

        for(int i=0;i<N;i++)
        {
            dducks[i]= sc.nextInt();
        }
        Arrays.sort(dducks);
        int answer = BS(dducks, M, 0, (int)1e9);

        System.out.println(answer);
    }

}
