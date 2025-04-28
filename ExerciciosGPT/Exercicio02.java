package ExerciciosGPT;
/*
 * Matriz 3x3
 * 0        1       2
 * Areia, Cimento e Tijolo -> Quantidades
 * Armazém 1 ->  Linha 0
 * Armazém 2 -> Linha 1
 * Armazém 3 -> Linha 2
 */

import util.Teclado;

public class Exercicio02 {
    public static void main(String[] args) {
        int quantProdutos [][] = new int[3][3];
        String material [][] = new String[3][3];
        int numArmazem = 1;
        int j = 0;
        int i;
        for ( i = 0; i < quantProdutos.length; i++) {

            for ( j = 0; j < quantProdutos.length; j++) {
                if (j == 0) {
                    quantProdutos[i][j] = Teclado.lerInt("Digite a Quantidade de Areia:");
                    material[i][j] = quantProdutos[i][j] + " Areias";

                } else if (j == 1) {
                    quantProdutos[i][j] = Teclado.lerInt("Digite a Quantidade de Cimento:");
                    material[i][j] = quantProdutos[i][j] + " Cimentos";

                    
                } else{
                    quantProdutos[i][j] = Teclado.lerInt("Digite a Quantidade de Tijolos:");
                    material[i][j] = quantProdutos[i][j] + " Tijolos";

                }
            }
        }
        for ( i = 0; i < material.length; i++) {
                System.out.print("Armazém " + numArmazem + " -> " );
                for ( j = 0; j < material.length; j++) {
                    if (j == material.length - 1) {
                    System.out.println(material[i][j]);
                        
                    } else{
                    System.out.print(material[i][j] + ", ");

                    }
                }
                numArmazem++;
                
            
            
        }

        

    }
    
}
