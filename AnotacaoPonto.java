package fundamentos;

public class AnotacaoPonto {
	
	public static void main(String[] args) {
	
		String s = "Bom dia X";
		s=s.toUpperCase();
		// METODO PARA A STRING SER TRASNFORMADA
	    //EM LETRA MAIUSCULA;
		
		System.out.println();
		
		s=s.replace("X", "senhora"); //SUBSTITUI��O
		s=s.concat("!!!"); 
		
		System.out.println(s);
		
		/* UMA SENTEN�A DE C�DIGO N�O NECESSARIAMENTE FICA 
		   DENTRO DE UMA �NICA LINHA.
		 * A ORGANIZA�AO DO C�DIGO � DE SUA PREFER�NCIA.
		 * JAVA TEM POUCO MAIS DE 50 PALAVRAS RESERVADAS. 
		 * ALGUMAS FUNCIONALIDADES NO JAVA, FUNCIONAM DENTRO DE UMA STRING,
		   E OUTRAS NAO. 
		*/	
	}

}
