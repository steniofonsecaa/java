
public class Conta {
	private String nome;
	private double saldo;
	private double limite;
	private double limiteUtilizado;
	private int saques;
	
	// Construtor da Conta que receber� dois par�metros
	public Conta(String nome, double saldo, double limite)
	{
		this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
	}

	// M�todo que realiza o dep�sito v�lido da conta
	public void depositar(double valorDeposito) 
	{
		// Valida��o do dep�sito
		if (valorDeposito > 0.0) {
			saldo = saldo + valorDeposito;// Adiciona o valor do dep�sito ao saldo
			System.out.printf("%nValor depositado: %.2f %n", valorDeposito);
			System.out.printf("Novo saldo: %.2f %n", saldo);
		}
	}
	
	// M�todo que realiza o saque da conta
	public void sacar(double valorSaque) 
	{
		//Valida��o do valor do saque
		if(valorSaque <= limite) {
			if (valorSaque > 0.0 && saldo > valorSaque) {
				saldo = saldo - valorSaque;// Ataliza o novo saldo
				limite = limite - valorSaque;// Atualiza o novo valor para saque
        		limiteUtilizado = limiteUtilizado + valorSaque;
        		saques = saques + 1;
				System.out.printf("%nValor sacado: %.2f %n", valorSaque);
				System.out.printf("Novo saldo: %.2f %n", saldo);
			}
		}else{
			System.out.println("Valor acima do limite para saque!");
		}
	}
	
	// M�todo para mostrar os limites (d�spon�vel e utilizado na conta)
	public void mostraLimites() 
	{
		System.out.printf("%nLimite dispon�vel: %.2f %n", limite);
		System.out.printf("Limite Utilizado: %.2f %n", limiteUtilizado);
	}
	
	public void extrato() 
	{
		System.out.println("\n---*EXTRATO*---");
		System.out.println("Nome: " + nome);
        System.out.printf("Saldo atual: %.2f\n", saldo);
        System.out.println("Saques realizados hoje: " + saques);
	}
	
	// M�todo que define o nome
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	// M�todo que retorna o nome
	public String getNome() 
	{
		return nome;
	}
	
	// M�todo que retorna o saldo da conta
	public double getSaldo() 
	{
		return saldo;
	}
	
	// M�todo que define o limite
	public void setLimite(double limite) 
	{
		this.limite = limite;
	}
	
	// M�todo que retorna o limite
	public double getLimite() 
	{
		return limite;
	}
}