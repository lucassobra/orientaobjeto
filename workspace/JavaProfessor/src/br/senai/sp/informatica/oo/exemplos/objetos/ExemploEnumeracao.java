package br.senai.sp.informatica.oo.exemplos.objetos;

public class ExemploEnumeracao {
	
	public static void main(String[] args) {
		//ExemploEnumeracao ex = new ExemploEnumeracao();
		
		Sexo sxo = Sexo.FEMININO;
		
		System.out.println(sxo + "\n" + Sexo.MASCULINO);
	}
}

enum Sexo {
	FEMININO,
	MASCULINO;
}
