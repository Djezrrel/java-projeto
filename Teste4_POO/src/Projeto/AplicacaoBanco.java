package Projeto;

import java.util.Scanner;

public class AplicacaoBanco {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);

			System.out.println("Cadastro de Usuário");
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Sobrenome: ");
			String sobrenome = scanner.nextLine();
			System.out.print("CPF: ");
			String cpf = scanner.nextLine();

			Usuario usuario = new Usuario(nome, sobrenome, cpf);

			System.out.print("Informe o saldo inicial: ");
			double saldoInicial = scanner.nextDouble();
			ContaBancaria conta = new ContaBancaria(usuario, saldoInicial);
			

			System.out.println("Bem-vindo(a), " + usuario.getNome() + " " + usuario.getSobrenome() + "!");
			System.out.println("CPF: " + usuario.getCpf());
			System.out.println("Saldo Inicial: " + conta.consultarSaldo());

			while (true) {
				System.out.println("\nEscolha uma opção:");
				System.out.println("1 - Consultar Saldo");
				System.out.println("2 - Realizar Depósito");
				System.out.println("3 - Realizar Retirada");
				System.out.println("4 - Encerrar");
				
				int opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					System.out.println("Saldo atual: " + conta.consultarSaldo());
					break;
				case 2:
					System.out.print("Informe o valor do depósito: ");
					double valorDeposito = scanner.nextDouble();
					conta.depositar(valorDeposito);
					break;
				case 3:
					System.out.print("Informe o valor da retirada: ");
					double valorRetirada = scanner.nextDouble();
					conta.realizarRetirada(valorRetirada);
					break;
				case 4:
					System.out.println("Obrigado por utilizar nosso serviço. Até logo!");
					scanner.close();
					System.exit(0);
				
				default:
					System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
				}
				
			}
			
		}

	}
