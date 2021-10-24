package fundamentos;

public class AnotacaoPonto {
	
	public static void main(String[] args) {
	
		String s = "Bom dia X";
		s=s.toUpperCase();
		// METODO PARA A STRING SER TRASNFORMADA
	    //EM LETRA MAIUSCULA;
		
		System.out.println();
		
		s=s.replace("X", "senhora"); //SUBSTITUIÇÃO
		s=s.concat("!!!"); 
		
		System.out.println(s);
		
		/* UMA SENTENÇA DE CÓDIGO NÃO NECESSARIAMENTE FICA 
		   DENTRO DE UMA ÚNICA LINHA.
		 * A ORGANIZAÇAO DO CÓDIGO É DE SUA PREFERÊNCIA.
		 * JAVA TEM POUCO MAIS DE 50 PALAVRAS RESERVADAS. 
		 * ALGUMAS FUNCIONALIDADES NO JAVA, FUNCIONAM DENTRO DE UMA STRING,
		   E OUTRAS NAO. 
		*/	
	}

}
