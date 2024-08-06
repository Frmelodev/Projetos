package contabanco;
import java.util.Scanner;



public class ContaTerminal {
int numerodaConta;
String agencia;
String nomedoCliente;
double saldo;

  public static void main(String[] args) {
	  
	   Scanner input = new Scanner(System.in);
	  
	   ContaTerminal conta = new ContaTerminal();
	   
	   System.out.println("Bem vindo ao internet banking do Banco de Braavos,para seu primeiro acesso "
	   		+ "por favor entre com o numero da sua agencia e da sua conta");
	   conta.agencia=input.nextLine();
	   conta.numerodaConta=input.nextInt();
	   
	   System.out.println("Por favor digite seu nome completo");
	   conta.nomedoCliente = input.nextLine();
	   
	   input.close();
	   
	   System.out.println("Ola" + conta.nomedoCliente + "obrigado por criar uma conta em nosso banco,sua agencia é" + conta.agencia + "e seu saldo" + conta.saldo + "ja esta disponivel para saque");
	   
	   
	    
	
	  
	 
	  
	  
  }
}
