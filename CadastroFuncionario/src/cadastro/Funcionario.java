package cadastro;

public class Funcionario {
	public String nome;
	public String setor;
	public double telefone;
    public static  double salarioBruto;
	
	
		public void aumentarSalario(double percentage) {
		salarioBruto+=salarioBruto*percentage/100;
	}
	
}
