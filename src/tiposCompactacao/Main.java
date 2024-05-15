package tiposCompactacao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compactador[] compactadores = new Compactador[2];
		
		compactadores[0]= new Compactador7z();
		compactadores[1] = new CompactadorZip();
		
		String path = "C:\\Users\\Usuario.U2503A01015\\Desktop\\";
		compactadores[1].compactar(path, "AAAAA.zip", "a.txt");
		
	}

}
