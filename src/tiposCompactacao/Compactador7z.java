package tiposCompactacao;
import java.io.IOException;


public class Compactador7z extends Compactador{

	@Override
	public void compactar(String path, String saida, String entrada){
		
		String comando = String.format("tar -cf %s%s %s%s", path, saida, path, entrada);
		Runtime run = Runtime.getRuntime();
		try {
			run.exec(comando);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
