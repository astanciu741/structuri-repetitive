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
        int n=7;
        Ex5.desc(n);
    }
}
