import java.util.Scanner;
import java.util.Random;
class TestStringCaching
{
//    public static class Entrada {
//           static int a;
//           static int b;
//    }
   public static void main(String args[])
   {
//       int max = 21000;
//       int a[] = new int[max];
//       int b[] = new int[max];
//       int c[][] = new int[max][max];
//       
//       
//       Entrada[] e = new Entrada[max];
//       
//       for (int i = 0; i < max; i++) {
//           a[i] = max;
//           b[i] = max;
//           e[i].a = max;
//           e[i].b = max;
//       }
//       
//       long st1 = System.currentTimeMillis();
//       for (int i = 0; i < max; i++) {
//           System.out.print(a[i] + "," + b[i]);
//       }
//       System.out.println();
//       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1));
//       
//       st1 = System.currentTimeMillis();
//       for (int i = 0; i < max; i++) {
//           System.out.print(e[i].a + "," + e[i].b);
//       }
//       System.out.println();
//       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));
//       
       int n = 10;
       
       int maior = 200000;
       int menor = 1000;
       int cont = 0;
       
       int vetor1[][] = new int[maior][menor];
       int vetor2[][] = new int[maior][menor];
       
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor1[i][j] = 100;
           }
       }     
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2[i][j] = 100;
           }
       }
       
       
       
       // Começa aqui
       long st1 = System.currentTimeMillis();
       for (int i = 0; i < menor; i++) {
           for (int j = 0; j < maior; j++) {
               vetor1[j][i] = n * vetor1[j][i];
               cont++;
           }
       }
       System.out.println(cont);
       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1));
       
       cont = 0;
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2[i][j] = n * vetor2[i][j];
               cont++;
           }
       }
       System.out.println(cont);
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));
       // Termina aqui
   } 
}
