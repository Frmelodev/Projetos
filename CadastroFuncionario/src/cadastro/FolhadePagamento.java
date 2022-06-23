package cadastro;


public class FolhadePagamento {

public static double INSS;
public static double IRRF;



public static double descontoINSS() {
	double descontoINSS=INSS;
	if(Funcionario.salarioBruto<=1212.00) {
	return INSS= Funcionario.salarioBruto*7.5/100;
	}if (1212.01<Funcionario.salarioBruto && Funcionario.salarioBruto <2427.36) {
		return INSS= Funcionario.salarioBruto*9/100;
	}if(2427.36<Funcionario.salarioBruto && Funcionario.salarioBruto <3641.04) {
		return INSS= Funcionario.salarioBruto*12/100;
	}if(3641.04<Funcionario.salarioBruto && Funcionario.salarioBruto <7087.23) {
		return INSS= Funcionario.salarioBruto*14/100;
	}if(7087.23<Funcionario.salarioBruto) {
		return INSS= 828.39;
	}return descontoINSS;
}
public static double descontoIRRF() {
	double descontoIRRF=IRRF;
	if(Funcionario.salarioBruto<=1903.98) {
		return IRRF= 0;
	}if (1903.99<Funcionario.salarioBruto && Funcionario.salarioBruto <2826.66) {
		return IRRF= Funcionario.salarioBruto*7.5/100;
	}if(2826.66<Funcionario.salarioBruto && Funcionario.salarioBruto <3751.06) {
		return IRRF= Funcionario.salarioBruto*15/100;
	}if(3751.05<Funcionario.salarioBruto && Funcionario.salarioBruto <4664.69) {
		return IRRF= Funcionario.salarioBruto*22/100;
	}if(4664.68<Funcionario.salarioBruto) {
		return IRRF= Funcionario.salarioBruto*27.5/100;
	}return descontoIRRF;
}
public static double salarioLiquido() {
	double salarioLiquido = (Funcionario.salarioBruto-(descontoINSS()+descontoIRRF()));
	return salarioLiquido;
	
}
}
