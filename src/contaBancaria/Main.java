package contaBancaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Clientes cliente = new Clientes();
        cliente.setNomeCliente("Simone");
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100);
		cc.nomeTitular = "Conta 1";


		ContaPoupanca cp = new ContaPoupanca();
		cp.nomeTitular = "Conta 2";
		cc.transferir(30, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
