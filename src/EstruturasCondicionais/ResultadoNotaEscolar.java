package EstruturasCondicionais;
//Estrutura Composta:Quando o programa deve seguir mais de uma jornada de execução condicionaado a uma regra de negócio.Há um fluxo quando a condição e verdadeira quanto um fluxo quando a condição e falsa.
//Estrutura Encadeada: Quando não estamos limitados a um if e else e podemos ter inumeras condições.
public class ResultadoNotaEscolar {
    public static void main(String[] args) {
        int nota = 6;
        
        if(nota >= 7)
        System.out.println("Aprovado");
        
        else if (nota >=5 && nota < 7 )
        System.out.println("Em recuperação");

        else 
        System.out.println("Reprovado");

    }
}
