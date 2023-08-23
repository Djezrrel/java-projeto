package Projeto;

public class ContaBancaria {
	private Usuario titular; //atributo titular do tipo usuario|| associar um objeto da classe Usuario a cada instância da classe ContaBancaria.
	private double saldo;

	public ContaBancaria(Usuario titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public double consultarSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
	}

	public void realizarRetirada(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Retirada realizada com sucesso. Novo saldo: " + saldo);
		} else {
			System.out.println("Saldo insuficiente para realizar a retirada.");
		}
	}
}
