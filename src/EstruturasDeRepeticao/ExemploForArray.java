//Array: Conjunto ou lista de elementos de um mesmo tipo. Cada elemento em uma array é acessado por um índice numérico específico.
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x < alunos.length; x++) {

            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    
    }
}
