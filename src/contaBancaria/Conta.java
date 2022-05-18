package contaBancaria;

public abstract class Conta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	// atributos
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String nomeTitular;
	

	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		// TODO Auto-generated constructor stub
	}
	
	// métodos
	public void sacar(double valor) {
		saldo-=valor;
	}
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirInfosComuns() {
	System.out.println("Nome Titular ===> "+getNomeTitular());
	System.out.println(String.format("Agencia: %d", getAgencia()));
	System.out.println(String.format("Numero: %d", getNumero()));
	System.out.println(String.format("Saldo: %.2f", getSaldo()));
	}
	
	// get e set
	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNomeTitular() {
		return this.nomeTitular;
	}



	  
}
