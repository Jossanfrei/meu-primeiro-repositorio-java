import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		String lugar = "Rio de Janeiro";
		
        System.out.println( "Rio de Janeiro cidade maravilhosa.");
        localizaRJ(lugar);
         
         
	}

	private static void localizaRJ(String lugar) throws IOException, URISyntaxException {
		Desktop.getDesktop().browse(new URI("www.riocidademaravilhosa.com.br"));
	}

}
