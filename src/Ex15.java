public class Ex15 {
    public static void invers(int n, int m){
        int reverse1=0;
        while(n!=0)
        {
            reverse1=reverse1*10+n%10;
            n=n/10;
        }
        if(reverse1==m)
            System.out.println("TRUE => Nr1 este inversul Nr2");

        else
            System.out.println("FALSE => Nr1 NU este inversul Nr2");
    }
}
