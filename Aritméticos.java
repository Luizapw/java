package fundamentos;

public class Aritm�ticos {

	public static void main(String[] args) {
		//� POSSIVEL ARMAZENAR VALORES DENTRO DO SYSTEM.OUT
		System.out.println(2 + 3);
		
		//E TAMB�M ARMEZENAR USANDO VARIAV�IS
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		//EXEMPLOS COM VALORES INTEIROS:
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a /(double) b);
		System.out.println(a /(float) b);
		
		//OPERADORES MODULO:
		
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		/*DIVIS�O COM VALORES INTEIROS O RESULTADO SEMPRE SERA INTEIRO
		 PARA QUE O VALOR D� RESULTADO QUEBRADO, � NECESSARIO USAR
		 O CAST, OU SEJA, UMA CONVERS�O.
		 */
	}
}
