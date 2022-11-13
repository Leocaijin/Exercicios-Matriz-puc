import java.util.Random;
class Ex05{
/*5. Faça um programa que leia uma matriz quadrada de 10 x 10 elementos reais e imprima-a. 
  Troque, a seguir: 
a)  a segunda linha pela oitava linha; 
b) a quarta coluna pela nona coluna; 
c)  imprima a matriz trocada.*/
public static void main(String[] args) {

    int[][]matriz = new int [10][10];
    Random rd = new Random(); 
    int aux;

    for(int i = 0;i< matriz.length;i++){
        for(int j = 0 ;j < matriz[i].length;j++){
            matriz[i][j] = rd.nextInt(100);
        } 
    }
    System.out.println("Matriz");
    for(int i = 0;i< matriz.length;i++){
        for(int j = 0 ;j < matriz[i].length;j++){  
            System.out.print(matriz[i][j]+" \t ");        
  }
 System.out.println();     
  } 

  System.out.println("Matriz trocada");
  for(int i = 0;i< matriz.length;i++){
    for(int j = 0 ;j < matriz[i].length;j++){ 
        if(i == 1){
            aux = matriz[1][j];
            matriz[1][j] = matriz[7][j];
            matriz[7][j] = aux;
        }

        if(j== 3){
            aux = matriz[i][3];
            matriz[i][3] = matriz[i][8];
            matriz[i][8] = aux;
        }
         
         System.out.print(matriz[i][j]+" \t");
        }
        System.out.println();
     }

}
  
}
