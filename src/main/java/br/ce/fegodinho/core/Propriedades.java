package br.ce.fegodinho.core;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = false;
	
	public static Browsers browser = Browsers.FIREFOX;
	
	public static String NOME_CONTA_ALTERADA = "Conta alterada " + System.nanoTime();
	
	public enum Browsers {
		CHROME,
		FIREFOX,
		INTERNET_EXPLORER,
		MICROSOFT_EDGE
	}

}
