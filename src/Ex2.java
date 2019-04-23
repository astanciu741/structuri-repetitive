public class Ex2 {

    public static void transformare(int n){
      int k=1;

        do{ k++;
           if (n%2==0){n=n/2;}
           else if (n%2==1){n=3*n+1;}

        }while(n!=1);
     System.out.println(k);
}}


