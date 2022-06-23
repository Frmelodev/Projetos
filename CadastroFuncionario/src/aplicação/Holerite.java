package aplicação;
import cadastro.FolhadePagamento;
import cadastro.Funcionario;

import java.util.Scanner;
public class Holerite {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		Funcionario fun= new Funcionario();
		System.out.print("Nome:  ");
		fun.nome=sc.nextLine();
		System.out.println(Funcionario.salarioBruto);
		System.out.println(FolhadePagamento.descontoINSS());
		System.out.println(FolhadePagamento.descontoIRRF());
		System.out.println(FolhadePagamento.salarioLiquido());
		sc.close();
	}

}
