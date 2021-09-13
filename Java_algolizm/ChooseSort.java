package Java_algolizm;

public class ChooseSort {
    public static void main(String[] args){ //선택정렬
        int n = 10;
        int []array = {7,5,9,0,3,1,6,2,4,8};

        for(int i=0;i<n;i++)
        {
            int min_index = i;
            for( int j=i+1;j<n;j++) {
                if(array[min_index] > array[j])
                min_index = j;
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;

        }

        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }

    }
}
