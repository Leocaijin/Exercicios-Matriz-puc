import java.util.Random;

class Ex01{
    public static void main(String[] args) {
/*PONTIFÍCIA UNIVERSIDADE CATÓLICA DE MINAS GERAIS 
Laboratório de Algoritmos e Técnicas de Programação – 2/2022 
Professoras: Michelle Nery Nascimento e Marta 
Aluno: Leonardo de Souza Rodrigues
AULA – Arrays Bidimensionais (Matrizes) 
 
1. Exercícios: 
 
1. Faça um programa que armazene dados inteiros em uma matriz 5 x5 e imprima: toda a matriz 
e  uma  outra  matriz  cujos  números  que  se  encontrem  em  posições  cujo  índice  da  linha  mais 
coluna formem um número par.  */

//matriz de 5 linhas e 5 colunas
int[][] matriz = new int[5][5];

Random rd = new Random();

for(int i = 0;i< matriz.length;i++){             //percore o indice da linha
    for(int j = 0;j< matriz[i].length;j++){    //percorre o indice da coluna
        matriz[i][j] = rd.nextInt(51); //preenche as matrizes c/ num.randomicos
        System.out.print(matriz[i][j] + "   ");
    }
    System.out.println();  
}
System.out.println("Os pares da matriz são: ");
for(int i = 0;i< matriz.length;i++){             //percore o indice da linha
    for(int j = 0;j< matriz[i].length;j++){    //percorre o indice da coluna
        matriz[i][j] = rd.nextInt(51); //preenche as matrizes c/ num.randomicos

        if(matriz[i][j] % 2 == 0){      //numeros pares da matriz
            System.out.print(matriz[i][j] + "   ");
        }
    }
}
    }
}