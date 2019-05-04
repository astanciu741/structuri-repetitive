public class Ex10 {

    public static void sumaPare() {
        //int s[0]=1, s[1]=65; s[2]=4, s[3]= 4, s[4]=3, s[5]=7;
        int[] s =new int[]{1,4, 3, 5, 8 };
        int k=0, suma =0;
        for (int i = 0; i < s.length ; i++) {
            if (s[i]%2==0 && k!=5){k++;
                           suma= suma+s[i];}
            //if (k==5) break;
        }
    System.out.println(suma);}

        }



