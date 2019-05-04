public class Ex16 {
    public static void sumaCifrePozitiiPare(int n)
    {
        int x=0,s=0; //x contor si s suma noastra
        int aux=n;
        while(aux!=0)
        { if (x % 2 == 0){
            s= s+n%10;
            aux=aux/10;}
        else  aux=aux/10;
            x++;
        }

        System.out.println("Suma cifrelor numarului " + n + " de pe pozitii pare este " + s);



    }
}

