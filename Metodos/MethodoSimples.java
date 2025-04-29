package Metodos;
import util.Teclado;

public class MethodoSimples {
    
    public void Saudacao (String lastName){
        System.out.println("Olá Ismael " + lastName);
    }
    

    public void Praticar (String texto){
        System.out.println("Praticando " + texto);
    }


    public void Somar (int n1, int n2){
        int total = n1 + n2;
        System.out.println("Resultado Soma-> " + total);

    }
    public void Subtracao (int n1, int n2){
        int total = n1 - n2;
        System.out.println("Resultado Subtração -> " + total);

    }
    public void Multiplicacao (int n1, int n2){
        int total = n1 * n2;
        System.out.println("Resultado Multiplicação -> " + total);

    }
    public void Divisao (int n1, int n2){
        int total = n1 / n2;
        System.out.println("Resultado Divisão -> " + total);

    }

    public void ImparPar (int num){
        if (num <= 0) {
            System.out.println("Valor Menor ou Igual a Zero!");
        } else {
            if (num % 2 == 0) {
                System.out.println(num + " é Par!");
            } else {
                System.out.println(num + " é ímpar!");
                
            }
        }
        
    }


    public void VerificarTriangulo (double a, double b, double c){
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            System.out.println("Você Digitou Algum Valor Negativo ou Igual a Zero. Infelizmente Não Terá Como Prosseguir");
            
        } else {
            if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
                System.out.println("De ACordo com as Medidas, é um Triângulo Existente!");
                System.out.print("Classificação -> ");
                if ((a == b) && (a == c) && (b == c)) {
                    System.out.println("Equilátero");
                    
                } else if ((a != b) && (a != c) && (b != c)) {
                    System.out.println("Escaleno");
                    
                } else{
                    System.out.println("Isósceles");
                    
                }
            } else {
                System.out.println("Triângulo Inexistente!");

            }
        }
        
    }


    public static void main(String[] args) {
        
        System.out.println();
        System.out.println();

        MethodoSimples Chamar = new MethodoSimples();

        String sobrenome = Teclado.lerTexto("Digite seu Sobrenome:");
        Chamar.Saudacao(sobrenome);
        Chamar.Saudacao("Teixeira");
        Chamar.Praticar("Métodos Simples!");
        int a = Teclado.lerInt("Digite o Primeiro Número");
        int b = Teclado.lerInt("Digite o Segundo Número");
        //Operações Básicas
        Chamar.Somar(a, b);
        Chamar.Subtracao(a, b);
        Chamar.Multiplicacao(a, b);
        Chamar.Divisao(a, b);

        //Pular Linha
        System.out.println();
        System.out.println();

        //Par ou ímpar
        Chamar.ImparPar(a);
        Chamar.ImparPar(b);

        //Triângulos
        double ladoA = Teclado.lerDouble("Digite o Valor do 1º Lado do Triângulo");
        double ladoB = Teclado.lerDouble("Digite o Valor do 2º Lado do Triângulo");
        double ladoC = Teclado.lerDouble("Digite o Valor do 3º Lado do Triângulo");

        Chamar.VerificarTriangulo(ladoA, ladoB, ladoC);



    }
}
