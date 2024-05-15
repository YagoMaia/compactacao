package tiposCompactacao;

public abstract class Compactador {
	
	String extensao;
	
	public abstract void compactar(String path, String extensao, String nomeArquivo);
	
}
