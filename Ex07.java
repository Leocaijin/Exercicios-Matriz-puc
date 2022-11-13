import java.util.Random;

public class Ex07 {
/*7. Crie  um  programa  que  declara  e  preenche  uma  matriz  6 x 6  e  armazene  em  um  vetor  A  o 
maior  elemento  cadastrado  em  cada  coluna  da  matriz  e  em  um  vetor  B  o  menor  elemento 
cadastrado em cada coluna da matriz. Imprima: 
a) toda a matriz; 
b) o vetor A; 
c) o vetor B;  
d) os valores dos vetores da seguinte forma (A[i] + B[i])/2.  */
public static void main(String[] args) {

    int[][]matriz = new int[6][6];
    int[] vetMaior = new int[6];
    int[] vetMenor = new int[6];
   
    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    Random rd = new Random();

    System.out.println("Toda a Matriz");
    for(int i = 0; i < matriz.length; i++){
        for(int j= 0; j < matriz[i].length; j++) {
          matriz[i][j] = rd.nextInt(51);
          System.out.print(matriz[i][j]+ " \t"); 
        }
        System.out.println();
    }

    for(int j = 0; j < matriz.length; j++){
        for(int i= 0; i < matriz[j].length; i++) {
            
            if(matriz[i][j]> maior){
                maior = matriz[i][j];
            } 
                    
            if(matriz[i][j]< menor){
                menor = matriz[i][j];
            } 
            
        }
        vetMaior[j] = maior; 
        vetMenor[j] = menor;   
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;         
    }

    System.out.println("\nMaiores elementos");
    //Maiores elementos das colunas
    for(int i =0; i < vetMaior.length; i++){
     System.out.print("\t "+ vetMaior[i]);   
    }

    System.out.println("\nMenores elementos");
    //Menores elementos das colunas
    for(int i =0; i < vetMenor.length; i++){
        System.out.print(" \t"+ vetMenor[i]);   
       }

}

}
        
    


