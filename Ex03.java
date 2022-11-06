import java.util.Random;

public class Ex03 {
/*3. Faça  um  programa  que  leia  os  elementos  de  uma  matriz  5  x  5  e  crie  dois  vetores  de  cinco 
posições  cada  um,  que  contenham,  respectivamente,  as  somas  das  linhas  e  das  colunas  da 
matriz. Escreva a matriz e os vetores criados.  */

public static void main(String[] args) {

    Random rd = new Random();
    int somaLinha = 0;
    int somaColuna = 0;
    
    int[][]matriz = new int [5][5];
    int[] vetA = new int[5]; //recebe os elementos de (l) linha
    int[] vetB = new int[5]; // recebe os elementos de (c) coluna

    //preenche as linhas e colunas c/ numeros randomicos
    for(int linha = 0;linha < matriz.length;linha++){
        for(int coluna = 0;coluna< matriz[linha].length;coluna++){
            matriz[linha][coluna] = rd.nextInt(10,51);  
           }
         }
         System.out.println("Soma das linhas");
         //soma linha
         for(int linha = 0;linha < matriz.length;linha++){
            for(int coluna = 0;coluna< matriz[linha].length;coluna++){
                somaLinha += matriz[linha][coluna];
            }
            vetA[linha] = somaLinha;
            System.out.print(vetA[linha] + " ");
        }
        System.out.println();

        System.out.println("Soma das colunas");
        //soma coluna
        for(int coluna = 0;coluna< matriz.length;coluna++){
            for(int linha = 0;linha<matriz[coluna].length;linha++){
                somaColuna += matriz[linha][coluna];
            }
            vetB[coluna] = somaColuna;
            System.out.print(vetB[coluna]+" ");
        }
        System.out.println();
    
    }
}
      
    


