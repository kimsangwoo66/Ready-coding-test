package Java_algolizm;

//탑다운 방식의 다이나믹 프로그래밍
public class FiboTD {

    //public static int []d = new int[100];
    static int []d = new int[100];

    public static int fb(int x){
        if(x==1 || x==2)
        {
            return 1;
        }

        if(d[x] !=0)
        {
            return d[x];
        }
       d[x] = fb(x-1) + fb(x-2);
        return d[x];
    }

    public static void main(String args[])
    {
        System.out.println(fb(4));
    }
}
