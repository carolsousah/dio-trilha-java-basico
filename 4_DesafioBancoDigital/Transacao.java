public class Main {

	public static void main(String[] args) {
		Cliente Carol = new Cliente();
		carol.setNome("Carol");
		
		Conta cc = new ContaCorrente(carol);
		Conta poupanca = new ContaPoupanca(carol);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}