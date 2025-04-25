public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("*****INICIO DO PROGRAMA*****");
        System.out.println("");

        System.out.println("Hello, World!");

        // Vetor -> Apenas Linha
        // Matriz -> Linhas e Colunas

        // Criando um vetor
        String[] nome = new String[3]; // Vetor de 3 posições
        nome[0] = "Ismael";
        nome[1] = "Santana";
        nome[2] = "Teixeira";
        // Imprimindo o vetor
        System.out.println("Nome -> " + nome[0] + " " + nome[1] + " " + nome[2]); 
        
        //Sintaxe da Matriz -> String nome[][] = new String[3][3]; || String nome[][] = {};
        // Criando uma matriz
        String Escola[][] = {
            {"Nome", "Nota 1", "Nota 2", "Média"},
            {"Ismael", "8", "9", "8.5"},
            {"Isabel", "7", "6", "6.5"}
        };
        // Imprimindo a matriz
        System.out.println(Escola[1][3]);
        System.out.println("");

        System.out.println("*****FIM DO PROGRAMA*****");

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}