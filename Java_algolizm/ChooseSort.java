package Java_algolizm;

public class ChooseSort {
    public static void main(String[] args){ //선택정렬
       int n = 10;
       int []arr={7,5,9,0,3,1,6,2,4,8};
       for(int i=0;i<n;i++)
       {
           int minvalue = i;
           for(int j=i+1;j<10;j++)
           {
               if(arr[minvalue]>arr[j]) {
                   minvalue = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[minvalue];
           arr[minvalue] = temp;
       }
       for(int i=0;i<10;i++)
       {
           System.out.print(arr[i] + " ");
       }
    }
}
