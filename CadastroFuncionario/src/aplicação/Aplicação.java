package aplica��o;
import java.util.Scanner;
import cadastro.Funcionario;


public class Aplica��o {
	public static void main (String [] args) {
		Scanner sc=new Scanner (System.in);
		Funcionario fun=new Funcionario();
		System.out.print("Nome:  ");
		fun.nome = sc.nextLine();
		System.out.print("Telefone:  ");
		fun.telefone = sc.nextDouble();
		System.out.print("Setor:  ");
		fun.setor=sc.nextLine();
		System.out.print("salario bruto: ");
		fun.salarioBruto=sc.nextDouble();
		
		
        System.out.println();
		System.out.println("Funcionario:  "+ fun);
		System.out.println();
		System.out.print("Qual a porcentagem do aumento?");
		double percentage=sc.nextDouble();
		fun.aumentarSalario(percentage);
		
		System.out.println();
		System.out.println("Informa��o atualizada" + fun);
		sc.close();
	}
	

}
