public class TestStringCaching
{
   public static void main(String args[])
   {
       int n = 10;
      
//       int maior = 200000;
//       int menor = 1000;
       
       
       
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
       
       // Otimizado       
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste0[i][j] = n * vetor2Teste0[i][j];
           }
       }
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));       
       
        // Teste 1
       // Cria vetores
       maior = 5000;
       menor = 100;

       int[][] vetor1Teste1 = new int[maior][menor];
       int[][] vetor2Teste1 = new int[maior][menor];
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor1Teste1[i][j] = 100;
           }
       }
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste1[i][j] = 100;
           }
       }
       System.out.println("Teste 1");
       // Não otimizado
       st1 = System.currentTimeMillis();
       for (int i = 0; i < menor; i++) {
           for (int j = 0; j < maior; j++) {
               vetor1Teste1[j][i] = n * vetor1Teste1[j][i];
           }
       }
       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1));
       
       // Otimizado       
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste1[i][j] = n * vetor2Teste1[i][j];
           }
       }
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));
       
       // Teste 2
       maior = 5000;
       menor = 500;
       int[][] vetor1Teste2 = new int[maior][menor];
       int[][] vetor2Teste2 = new int[maior][menor];
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor1Teste2[i][j] = 100;
           }
       }
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste2[i][j] = 100;
           }
       }
       
       System.out.println("Teste 2");
       // Não otimizado
       st1 = System.currentTimeMillis();
       for (int i = 0; i < menor; i++) {
           for (int j = 0; j < maior; j++) {
               vetor1Teste2[j][i] = n * vetor1Teste2[j][i];
           }
       }
       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1));
       
       // Otimizado       
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste2[i][j] = n * vetor2Teste2[i][j];
           }
       }
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));
       
       // Teste 3
       maior = 5000;
       menor = 1000;
       int[][] vetor1Teste3 = new int[maior][menor];
       int[][] vetor2Teste3 = new int[maior][menor];
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor1Teste3[i][j] = 100;
           }
       }
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste3[i][j] = 100;
           }
       }
       
       System.out.println("Teste 3");
       // Não otimizado
       st1 = System.currentTimeMillis();
       for (int i = 0; i < menor; i++) {
           for (int j = 0; j < maior; j++) {
               vetor1Teste3[j][i] = n * vetor1Teste3[j][i];
           }
       }
       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1));
       
       // Otimizado       
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste3[i][j] = n * vetor2Teste3[i][j];
           }
       }
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));
       
       // Teste 4
       maior = 5000;
       menor = 2500;
       int[][] vetor1Teste4 = new int[maior][menor];
       int[][] vetor2Teste4 = new int[maior][menor];
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor1Teste4[i][j] = 100;
           }
       }
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste4[i][j] = 100;
           }
       }
       
       System.out.println("Teste 4");
       // Não otimizado
       st1 = System.currentTimeMillis();
       for (int i = 0; i < menor; i++) {
           for (int j = 0; j < maior; j++) {
               vetor1Teste4[j][i] = n * vetor1Teste4[j][i];
           }
       }
       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1));
       
       // Otimizado       
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste4[i][j] = n * vetor2Teste4[i][j];
           }
       }
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));
       
       // Teste 5
       maior = 5000;
       menor = 5000;
       int[][] vetor1Teste5 = new int[maior][menor];
       int[][] vetor2Teste5 = new int[maior][menor];
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor1Teste5[i][j] = 100;
           }
       }
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste5[i][j] = 100;
           }
       }
       
       System.out.println("Teste 5");
       // Não otimizado
       st1 = System.currentTimeMillis();
       for (int i = 0; i < menor; i++) {
           for (int j = 0; j < maior; j++) {
               vetor1Teste5[j][i] = n * vetor1Teste5[j][i];
           }
       }
       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1));
       
       // Otimizado       
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste5[i][j] = n * vetor2Teste5[i][j];
           }
       }
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));
       
       // Teste 6
       maior = 5000;
       menor = 10000;
       int[][] vetor1Teste6 = new int[maior][menor];
       int[][] vetor2Teste6 = new int[maior][menor];
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor1Teste6[i][j] = 100;
           }
       }
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste6[i][j] = 100;
           }
       }
       
       System.out.println("Teste 6");
       // Não otimizado
       st1 = System.currentTimeMillis();
       for (int i = 0; i < menor; i++) {
           for (int j = 0; j < maior; j++) {
               vetor1Teste6[j][i] = n * vetor1Teste6[j][i];
           }
       }
       System.out.println("tempo 1 " + (System.currentTimeMillis() - st1));
       
       // Otimizado       
       st1 = System.currentTimeMillis();
       for (int i = 0; i < maior; i++) {
           for (int j = 0; j < menor; j++) {
               vetor2Teste6[i][j] = n * vetor2Teste6[i][j];
           }
       }
       System.out.println("tempo 2 " + (System.currentTimeMillis() - st1));
   } 
}
