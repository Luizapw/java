package fundamentos;

public class Aritméticos {

	public static void main(String[] args) {
		//É POSSIVEL ARMAZENAR VALORES DENTRO DO SYSTEM.OUT
		System.out.println(2 + 3);
		
		//E TAMBÉM ARMEZENAR USANDO VARIAVÉIS
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
		
		/*DIVISÃO COM VALORES INTEIROS O RESULTADO SEMPRE SERA INTEIRO
		 PARA QUE O VALOR DÊ RESULTADO QUEBRADO, É NECESSARIO USAR
		 O CAST, OU SEJA, UMA CONVERSÃO.
		 */
	}
}
