public class NaoOtimizado
{
   public static void main(String args[])
   {
       int n = 10;
       
       // Teste 0
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
       
       System.out.println("Teste 0");
       // Não otimizado
       long st1 = System.currentTimeMillis();
       for (int i = 0; i < menor; i++) {
           for (int j = 0; j < maior; j++) {
               vetor1Teste0[j][i] = n * vetor1Teste0[j][i];
           }
       }
       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1)); 
}
