//Estrutura composta: Quando o programa deve seguir mais de uma jornada de execução condicionaado a uma regra de negócio.
//Há um fluxo quando a condição e verdadeira quanto um fluxo quando a condição e falsa.

public class ResultadoNotaEscolar {
    public static void main(String[] args) {
        int nota = 6;
        
        if(nota >= 7)
        System.out.println("Aprovado");

        else 
        System.out.println("Reprovado");

    }
}
