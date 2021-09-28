package Java_algolizm;

//다이나믹 프로그래밍 바텀 업방식
public class FiboBU {
    //자바에서는 이렇게 배열을 선언하면 각 인덱스 마다 디펄트 값으로 0으로 채워져 있다.
    public static int []d = new int[100];

    public static void main(String args[])
    {
        d[1]=1;
        d[2]=1;
        int n=4;
        for(int i=3;i<=n;i++)
        {

            d[i]=d[i-1]+d[i-2];
        }
        System.out.println(d[n]);
    }
}
