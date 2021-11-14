import java.util.Scanner;

public class Banco {
    
    public static void main(String[] args) {
        String nome;
		double valorInicial = 0.0;
        double deposito = 0.0;
        double saque = 0.0;
		double limite = 0.0;
		int opcao = 0;
		Scanner input = new Scanner(System.in);

        // Criação de 1 objeto para testes com os métodos da classe Conta
		System.out.println("---NOVA CONTA---");
        System.out.print("Digite o nome:");
        nome = input.next();
        System.out.print("Saldo inicial:");
        valorInicial = input.nextDouble();
        System.out.print("Limite para saldo:");
        limite = input.nextDouble();
        Conta conta1 = new Conta(nome, valorInicial, limite);
        
        System.out.println("\n\n------***CONTA 1***-----");
        System.out.printf("Nome: %s.%nSaldo: %.2f.%nLimite para saque: %.2f %n", conta1.getNome(), conta1.getSaldo(), conta1.getLimite());

        do {
        	System.out.println("\n---ESCOLHA A OPÇÃO---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver limites");
            System.out.println("4 - Extrato");
            System.out.println("5 - Para sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            
            switch(opcao) {
            
            	case 1:
            		System.out.printf("%nSaldo atual: %.2f %n", conta1.getSaldo());
            		System.out.print("Digite o valor do depósito:");
            		deposito = input.nextDouble();
            		conta1.depositar(deposito);
            	break;
            	
            	case 2:
            		System.out.printf("%nSaldo atual: %.2f %n", conta1.getSaldo());
            		System.out.printf("Limite para saque diário: %.2f %n", conta1.getLimite());
            		System.out.print("Digite o valor do saque:");
            		saque = input.nextDouble();
            		conta1.sacar(saque);
            	break;
            	
            	case 3:
            		conta1.mostraLimites();
            	break;
            	
            	case 4:
            		conta1.extrato();
            	break;
            	
            	case 5:
            		System.out.println("Saindo do sistema...");
            	break;
            	
            	default:
            		System.out.println("\nOpção inválida");
            }
            
        }while(opcao != 5);
        
    }
}