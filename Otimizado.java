public class Otimizado
{
   public static void main(String args[])
   {
       int n = 10;
       
     
       int maior = 5000;
       int menor = 10;
       int[][] vetor1Teste0 = new int[maior][menor];
       int[][] vetor2Teste0 = new int[maior][menor];
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor1Teste0[i][j] = 100;
           }
       }
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste0[i][j] = 100;
           }
       }
       
       long st1 = System.currentTimeMillis();
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste0[i][j] = n * vetor2Teste0[i][j];
           }
       }
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));       
       
     
}
