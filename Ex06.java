import java.util.Random;

public class Ex06 {
/*6. Faça  um  programa  que  leia  duas  matrizes  A  e  B  inteiras  e  gere  a  matriz  C  que  é  a  soma 
matricial  de  A  e  B.    Utilize  um  método  para  a  leitura  das  matrizes  e  um  outro  método  para 
gerar a matriz C.  */
public static void main(String[] args) {
    
    int[][]matrizA = new int[5][5];
    int[][]matrizB = new int[matrizA.length][matrizA.length];
    int[][]matrizC = new int[matrizA.length][matrizA.length];
    Random rd = new Random();

    //Preenchimento matrizA
    for(int i = 0;i< matrizA.length;i++){
        for(int j = 0;j< matrizA[i].length;j++){
            matrizA[i][j] = rd.nextInt(51);
        }
    }
    //preenchimento matrizB
    for(int i = 0;i<matrizB.length;i++){
        for(int j = 0;j<matrizB[i].length;j++){
            matrizB[i][j] = rd.nextInt(51);
        }
    }
    //printa matrizA
    System.out.println("matriz A");
    for(int i = 0;i< matrizA.length;i++){
        for(int j = 0;j< matrizA[i].length;j++){   
            System.out.print(matrizA[i][j]+" \t ");
        }
        System.out.println();
    }
      //printa matrizB
      System.out.println("matriz B");
      for(int i = 0;i< matrizB.length;i++){
          for(int j = 0;j< matrizB[i].length;j++){   
              System.out.print(matrizB[i][j]+" \t ");
          }
          System.out.println();
        } 
        System.out.println("matriz C");
        for( int i = 0;i< matrizC.length;i++){
         for(int j = 0;j< matrizC[i].length;j++){   
         }   
     }
    
    //preenche matrizC com a soma de A e B
    for( int i = 0;i< matrizC.length;i++){
        for(int j = 0;j< matrizC[i].length;j++){
           matrizC[i][j] = matrizA[i][j] + matrizB[i][j]; 
           System.out.print(matrizC[i][j]+" \t");    
       }
       System.out.println();
   }
  
        }
    }

 
        

  

