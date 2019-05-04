//package ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rezolvare exercitiu 1");
        Ex1 ex1= new Ex1();
        ex1.afisare();
        ex1.afisare2();
        System.out.println("\n");
        System.out.println("Rezolvare exercitiu 2");
        Ex2 ex2= new Ex2();
        ex2.transformare(6);
        //ex2.transformare(66);
        System.out.println("Rezolvare exercitiu 3");
        Ex3 ex3= new Ex3();
        ex3.select();
        System.out.println("Rezolvare exercitiu 5");
        //Ex5 ex5= new Ex5();
        //ex5.desc();
        int n=6;
        Ex5.desc(n);
        System.out.println("\nRezolvare exercitiu 7");
        Ex7.sumaCifre(n);
        System.out.println("\nRezolvare exercitiu 8");
        int a, b;
        a=4; b=3;
        Ex8.afisare(a, b);
        System.out.println("\nRezolvare exercitiu 9");
        Ex9.afisareBradut(5);
        System.out.println("\nRezolvare exercitiu 10");
        Ex10.sumaPare({1, 2, 3, 4, 7});
    }

}
