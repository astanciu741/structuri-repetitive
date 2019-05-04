public class Ex17 {
    public static void diferentaSumaCifre(int n)
    {
        int x=0,s_pare=0, s_impare=0, dif=0; //x contor si s suma noastra
        int aux=n;
        while(aux!=0)
        { if (x % 2 == 0){
            s_pare= s_pare+aux%10; }
        else if (x%2!=0)
        { s_impare= s_impare+aux%10;}
            aux=aux/10;
            x++;
        }
        if(s_pare > s_impare){
        dif = s_pare - s_impare;}
        else
            if(s_impare > s_pare){dif = s_impare - s_pare;}
        System.out.println("Suma cifrelor de pe pozitii pare - suma cifrelor de pe pozitii impare a numarului este = " + dif);



    }
}
