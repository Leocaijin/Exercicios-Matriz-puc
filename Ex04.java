import java.util.Random;

public class Ex04 {
/*4. Faça um programa que leia valores para uma matriz 2 x 3, gere e imprima a matriz transposta. 
 
Ex.:     M =   1    2    3   Mt = 1    4 
               4    5    6        2    5 
                                  3    6  */
public static void main(String[] args) {
    //declarando matriz de 2 linhas e 3 colunas.
    int[][]matriz = new int [2][3]; 
    int[][]matrizT = new int [3][2];
    Random rd = new Random();
    //Declarando a matriz
    for(int i = 0;i< matriz.length;i++){
        for(int j = 0;j< matriz[i].length;j++){
            matriz[i][j] = rd.nextInt(1,101);
        }  
    }
    //print matriz
    System.out.println("Matriz 2 x 3");
    for(int i = 0;i< matriz.length;i++){
        for(int j = 0;j< matriz[i].length;j++){
            System.out.print(matriz[i][j]+" \t ");
        }
          System.out.println();
        }
        System.out.println("Matriz transposta");
        for(int i = 0;i< matrizT.length;i++){
            for(int j = 0;j< matrizT[i].length;j++){
                matrizT[j][i] = matriz[i][j];
                System.out.print(matrizT[j][i]+" \t ");
               
            }
            System.out.println();
        }
        }
    
    }


