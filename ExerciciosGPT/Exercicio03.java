package ExerciciosGPT;

import util.Teclado;

public class Exercicio03 {
    public static void main(String[] args) {
        double preco [] = new double [5];
        double total = 0;
        for (int i = 0; i < preco.length; i++) {
            preco[i] = Teclado.lerDouble("Digite o preço do " + (i + 1) + "º Produto:");
            total += preco[i];

        }
        System.out.println("Custo Total -> R$" + total);
    }
        
    
}
