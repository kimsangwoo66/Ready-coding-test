package Java_algolizm;

public class Solution {
    //bottom up
    public static int climbStairs(int n) {
        //1.아래주석처럼 선언하면  n =3 일경우 dp 배열은 dp[0]=0, dp[1]=0,dp2=0, dp[3]=0 이 만들어진다.
        //2.int dp[] = new int[n];
        int dp[] = new int[n+1];
        dp[0]=dp[1]=1;


        //3.만약 2번 주석처럼 배열을 선언했으면 for문에서 i=4일경우 인덱스 아웃바운드 오류가 발생할 수있다.
        //왜냐하면 실제로 배열이 생성된건 3번인덱스까지기 때문이다. dp[4]는 만들어지지 않는다.
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String args[])
    {
        System.out.println(climbStairs(3));
    }

}
