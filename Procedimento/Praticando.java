

public class Praticando{

    public static void main (String[] args){
        int Idades [][] = new int[2][5];

        Idades[0][0] = 10;
        for (int x = 0; x < 2; x++){
            for (int y = 0; y < 5; y++){
                Idades[x][y] = x + y + ((x+y) * y);
            }
        }
        for (int x = 0; x < 2; x++){
            for (int y = 0; y < 5; y++){
                System.out.println("Idade " + (x) + " " + (y) + " -> " + Idades[x][y]);
            }
        }
        
    }

}