package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import aplicacao.entidades.Empregado;
import aplicacao.entidades.EmpregadoAssalariado;
import aplicacao.entidades.EmpregadoComissionado;
import aplicacao.entidades.EmpregadoComissionadoPlus;
import aplicacao.entidades.EmpregadoHorista;

/*
 * authors: 
 * 	Geovanna Alcântara
 * 	Rafael Henrique
 * 	Italo Guerra
 * 	Karen Gabrielle
 */

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		EmpregadoAssalariado empregadoAssalariado = new EmpregadoAssalariado("Kleber", "Santos", "632.458.154-88", 3000.00);
		EmpregadoHorista empregadoHorista = new EmpregadoHorista("Julia", "Freitas", "215.965.784-22", 17, 500);
		EmpregadoComissionado empregadoComissionado = new EmpregadoComissionado("Jhonatan", "Campos", "487.965.157.88", 6000, 0.5);
		EmpregadoComissionadoPlus empregadoComissionadoPlus = new EmpregadoComissionadoPlus("Raissa", "Menezes", "214.894.784-66", 3000, 0.7, 1500);
		
		List<Empregado> empregados = new ArrayList<>(Arrays.asList(empregadoAssalariado, empregadoHorista, empregadoComissionado, empregadoComissionadoPlus));

		System.out.printf("\n***************Empregados processados individualmente***************\n\n");
		for(Empregado empregado : empregados) {
			System.out.printf("%s\n%s: $%.2f\n\n", empregado,"Vencimento", empregado.vencimento());
		}
		System.out.printf("*********************************************************************\n\n");
		
		for(Empregado empregado : empregados) {
			System.out.printf("%s\n\n", empregado);
			
			if(empregado instanceof EmpregadoComissionadoPlus) {
				EmpregadoComissionadoPlus auxEmpregado = (EmpregadoComissionadoPlus) empregado;
				auxEmpregado.setSalarioBase(1.10 * auxEmpregado.getSalarioBase());
				System.out.printf("Novo salário com 10%% de aumento e $%.2f\n", auxEmpregado.getSalarioBase());
			}
			System.out.printf("Vencimentos $%.2f\n\n", empregado.vencimento());
		}
		
	}
	
	
	
}
