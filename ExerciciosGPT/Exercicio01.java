
package ExerciciosGPT;

import util.Teclado;

public class Exercicio01 {

    public static void verificarObjetivoCalorico(int consumo){
        if (consumo < 2000){
            System.out.println("Meta não Atingida.");
        } else {
            System.out.println("Meta Atingida!");
        }
    
    }

    public static void main(String[] args) {
        int consumo = Teclado.lerInt("Digite o consumo de calorias: ");
        verificarObjetivoCalorico(consumo);
        
        
    }

    
}