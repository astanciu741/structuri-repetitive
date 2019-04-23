public class Ex3 {
//int n= 7;
 public static void select(){

     int[] intArray = new int[7];
     intArray[0] = 50;
     intArray[1] = 71;
     intArray[2] = 35;
     intArray[4] = 16;
     intArray[5] = 22;
     intArray[6] = 32;
     int k=0;// variabila cu aj careia verific daca sirul e format doar din numere pare(caz in care ramane 0)
     int max = -10000;

     for (int i= 0; i<=6; i++){
         if (intArray[i]%2!=0){k=1;}
         if (intArray[i]%2!=0 && intArray[i]>max){max=intArray[i];}
     }
     if (k==0){System.out.println("no (toate numerele sunt pare)");}
     else {System.out.println("Cel mai mare nr impar din sir este : " + max);}



 }
}
