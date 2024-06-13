package op_logicas_condicionais_relacionais;
import java.util.InputMismatchException;
import java.util.Scanner; 
/**
 * Exemplo de uso da estrutura de controle switch-case para imprimir o nome completo de um estado brasileiro com base no código numérico do estado.
 * 
 * @author SuperAdmin
 */
public class SwitchCaseExemplo {

    public static void main(String[] args) {
        // Código numérico do estado (exemplo: 1 para Acre, 2 para Alagoas, etc.)
    	Scanner leitor = new Scanner(System.in);
        int codigoEstado = 0;
    	
    	try {
    		System.out.println("Digite o código do Estado:");
    		codigoEstado = leitor.nextInt();
    	}catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
            return;
        } finally {
            leitor.close();
        }
    	
    	
        // Utilizando a estrutura switch-case para imprimir o nome completo do estado
        switch (codigoEstado) {
            case 1:
                System.out.println("Acre");
                break;
            case 2:
                System.out.println("Alagoas");
                break;
            case 3:
                System.out.println("Amapá");
                break;
            case 4:
                System.out.println("Amazonas");
                break;
            case 5:
                System.out.println("Bahia");
                break;
            case 6:
                System.out.println("Ceará");
                break;
            case 7:
                System.out.println("Distrito Federal");
                break;
            case 8:
                System.out.println("Espírito Santo");
                break;
            case 9:
                System.out.println("Goiás");
                break;
            case 10:
                System.out.println("Maranhão");
                break;
            case 11:
                System.out.println("Mato Grosso");
                break;
            case 12:
                System.out.println("Mato Grosso do Sul");
                break;
            case 13:
                System.out.println("Minas Gerais");
                break;
            case 14:
                System.out.println("Pará");
                break;
            case 15:
                System.out.println("Paraíba");
                break;
            case 16:
                System.out.println("Paraná");
                break;
            case 17:
                System.out.println("Pernambuco");
                break;
            case 18:
                System.out.println("Piauí");
                break;
            case 19:
                System.out.println("Rio de Janeiro");
                break;
            case 20:
                System.out.println("Rio Grande do Norte");
                break;
            case 21:
                System.out.println("Rio Grande do Sul");
                break;
            case 22:
                System.out.println("Rondônia");
                break;
            case 23:
                System.out.println("Roraima");
                break;
            case 24:
                System.out.println("Santa Catarina");
                break;
            case 25:
                System.out.println("São Paulo");
                break;
            case 26:
                System.out.println("Sergipe");
                break;
            case 27:
                System.out.println("Tocantins");
                break;
            default:
                System.out.println("Código de estado inválido");
                break;
        }
    }
}
