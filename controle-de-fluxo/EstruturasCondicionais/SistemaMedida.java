//Switch: Usado para simplificar o código que envolve múltiplas condições. Com um switch, você pode comparar o valor de uma variável com uma lista de casos e executar o bloco de código correspondente ao caso que corresponde ao valor da variável
public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "G";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}
}