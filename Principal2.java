package Atividade;

import java.util.Scanner;

public class Principal2 {
	
	private static void lerDados(double[] salarios) {
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < salarios.length; i++) {
			System.out.println("Digite salario "+ i + "=");
			salarios[i] = leitor.nextDouble();
		}
	}
	private static double calcularMediaSal ( double [] salarios) {
		double soma = 0;
		for (int i = 0; i<3; i++) {
			soma += salarios[i];
		}
		double media = soma/3;
		
		return media;
	}
	private static int qtdMaiorMedia( double []salarios,double media ) {
		int salarioMaior=0;
		for (int i = 0; i<3; i++) {
			if(salarios[i] >= media)
				salarioMaior++;
		}
		
		return salarioMaior;
	}
	private static int qtdMenorMedia( double []salarios,double media ) {
		int salarioMenor=0;
		for (int i = 0; i<3; i++) {
			if(salarios[i] >= media)
				salarioMenor++;
		}
		
		return salarioMenor;
	}
	private static void mostrarSalario(double[] salarios) {
		for (int i = 0; i<3; i++) {
			System.out.println("Salario [ " + i+  " ] =" + salarios[i]);
		}
	}
	private static void mostrarSalario(double mediaSalario, int salarioMaior1, int salarioMenor1) {
		System.out.println("Media:"+mediaSalario);
		System.out.println("Quantidade maior que a media = "+salarioMaior1);
		System.out.println("Quantidade maior que a media = "+salarioMenor1);
	}
	

	public static void main(String[] args) {
		double [] salarios = new double [3];
		
		lerDados(salarios);
		
		double mediaSalario = calcularMediaSal(salarios);
		
		int salarioMaior1 = qtdMaiorMedia(salarios, mediaSalario);
		
		int salarioMenor1 = qtdMenorMedia (salarios, mediaSalario);
		
		mostrarSalario(salarios);
		
		mostrarSalario(mediaSalario, salarioMaior1, salarioMenor1);
	}
}
