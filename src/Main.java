import edu.dio.banco.Conta;
import edu.dio.banco.ContaCorrente;
import edu.dio.banco.ContaPoupanca;
import edu.dio.cliente.ClientePessoaFisica;
import edu.dio.cliente.ClientePessoaJuridica;

public class Main {

	public static void main(String[] args) {
		ClientePessoaFisica venilton = new ClientePessoaFisica("45789774584", "Venilton");
		venilton.setDataNascimento("01/06/1982");
		venilton.setEndereco("Rua do Rosário,158 - Paraíso - São Paulo - SP");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.imprimirExtrato();
		
		System.out.println("Transferindo da Conta Corrente para Conta Poupança: ");

		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		venilton.imprimirInformacoesCadastrais();

		ClientePessoaJuridica clientePJ = new ClientePessoaJuridica("99.999.999/9999-99", "Banco de Exemplo LTDA");
		clientePJ.setNomeFantasia("banco de exemplo");
		clientePJ.setEndereco("Rua Liberdade, 1254 - São Paulo");

		clientePJ.imprimirInformacoesCadastrais();

		Conta contaClientePJ = new ContaCorrente(clientePJ);

		contaClientePJ.depositar(100000);
		contaClientePJ.imprimirExtrato();
	}

}
