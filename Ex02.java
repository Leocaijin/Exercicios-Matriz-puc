import java.util.Random;

public class Ex02 {
/*2. Faça  um  programa  que  leia  os  elementos  de  uma  matriz  10  x  10  e  escreva  somente  os 
elementos acima da diagonal principal.  */
public static void main(String[] args) {
    //iniciando matriz 10x10
    int[][]matriz = new int [10][10];
    Random rd = new Random(); //numeros random preenche matriz
   
    for(int i = 0;i< matriz.length;i++){ //leitura da linha
        for(int j = 0;j< matriz[i].length;j++){ //leitura da coluna  
            matriz[i][j] = rd.nextInt(10,99);    
            
            System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Elementos acima da diagonal principal");
        for(int i = 0;i< matriz.length;i++){ //leitura da linha
            for(int j = 0;j< matriz[i].length;j++){
                if(j>i){
                    System.out.print(matriz[i][j]+"  ");
                } 
    }
    System.out.println();
}
}
}
