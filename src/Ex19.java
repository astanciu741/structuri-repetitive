public class Ex19 {
    public static void interpretareCNP(){
        long n = 2971009134147L;
        String sex="" ;
        String luna="" ;
        long aux = 0, zi = 0, an = 0;

        aux = n;
        long[] n2 = new long[14];
        ///salvez cnp ca array pt a putea manipula usor cifrele acestuia
        for (int i = 13; i >= 0; i--) {
            n2[i] = n2[i] + n % 10;
            n = aux / 10;
            aux = aux / 10;
        }
        for (int i = 1; i <= 13; i++) {

            if (n2[1] == 1 || n2[1] == 3 || n2[1] == 5 || n2[1] == 7)
                sex = "Baiat";
            else
                sex = "Fata";

            if (n2[4] == 0 && n2[5] == 1)
                luna = "IANUARIE";
            if (n2[4] == 0 && n2[5] == 2)
                luna = "FEBRUARIE";
            if (n2[4] == 0 && n2[5] == 3)
                luna = "MARTIE";
            if (n2[4] == 0 && n2[5] == 4)
                luna = "APRILIE";
            if (n2[4] == 0 && n2[5] == 5)
                luna = "MAI";
            if (n2[4] == 0 && n2[5] == 6)
                luna = "IUNIE";
            if (n2[4] == 0 && n2[5] == 7)
                luna = "IULIE";
            if (n2[4] == 0 && n2[5] == 8)
                luna = "AUGUST";
            if (n2[4] == 0 && n2[5] == 9)
                luna = "SEPTEMBRIE";
            if (n2[4] == 1 && n2[5] == 0)
                luna = "OCTOMBRIE";
            if (n2[4] == 1 && n2[5] == 1)
                luna = "NOIEMBRIE";
            if (n2[4] == 1 && n2[5] == 2)
                luna = "DECEMBRIE";
            if (n2[6] == 0)
                zi =  n2[7];
            else
                zi = n2[6] * 10 + n2[7];

            if (n2[1] == 1 || n2[1] == 2 || n2[1] == 7 || n2[1] == 8 )
                an = (long)(1900 + 10*n2[2] + n2[3]);

            if (n2[1] == 3 || n2[1] == 4)
                an = (long)(1800 + 10*n2[2] + n2[3]);

            if (n2[1] == 5 || n2[1] == 6)
                an = (long)(2000 + 10*n2[2] + n2[3]);








        }
        System.out.println("Persoana cu CNP.ul 2971009134147 este " + sex + " nascut/a pe " + zi + " " + luna + " " + an);
    }
}
