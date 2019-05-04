public class Ex7 {
    public static void sumaCifre(int n){
        long nouNr;
        nouNr = (long) Math.pow((2 * 3), n );
        System.out.println("Noul numar este: " + nouNr);
        int suma=0;
        while (nouNr!=0){
            suma += nouNr%10;
            nouNr/=10;
        }
        System.out.println("Suma cifrelor este: " + suma);
    }
}
