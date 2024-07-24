//Condição ternária: é uma forma abreviada de escrever uma estrutura condicional refatorando com o conceito de operador ternário.

public class ResultadoNotaEscolarCondicaoTernaria {
    public static void main(String[] args) {
    int nota = 3;
    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
    
    System.out.println(resultado);

    }
}