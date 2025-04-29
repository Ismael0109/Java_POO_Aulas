import util.Teclado;

public class teste {
    public static void main(String[] args) {
        int [] vetor = new int[5];
        int [][] matriz = new int[2][3];
        int i, j;

        for ( i = 0; i < matriz.length; i++) {

            for ( j = 0; j < matriz.length; j++) {
                matriz[i][j] = Teclado.lerInt("Digita");
            }
            
        }
        for ( i = 0; i < matriz.length; i++) {

            for ( j = 0; j < matriz.length; j++) {
                System.out.println(matriz [i][j]);
            }
            
        }

    }
}
