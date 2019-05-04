public class Ex9 {
    public static void afisareBradut(int n) {
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
