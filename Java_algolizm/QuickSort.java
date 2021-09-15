package Java_algolizm;

public class QuickSort {

    public static void qs(int []arr, int start, int end)
    {
            if(start>=end){
                return;
            }
            int pivot = start;
            int left = start + 1;
            int right = end;
            while (left<=right)
            {
                //피벗보다 큰데이터를 찾을때 까지 반복
                while (left <= end && arr[left] <=arr[pivot])
                {
                    left++;
                }
                //피벗보다 작은데이터를 찾을때 까지 반복
                while(right > start && arr[pivot] <= arr[right])
                {
                    right--;
                }

                //데이터가 엇갈린경우 피벗과 작은 데이터값 교체
                if(left>right)
                {
                    int temp = arr[pivot];
                    arr[pivot]= arr[right];
                    arr[right]=temp;
                }

                else
                {
                    int temp = arr[left];
                    arr[left]= arr[right];
                    arr[right]=temp;
                }

            }
            qs(arr, start, right-1);
            qs(arr, right+1,end);



    }

    public static void main(String args[]){
        int []array={5,7,9,0,3,1,6,2,4,8};

        qs(array,0,array.length-1);

        for(int i =0; i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }



    }
}
