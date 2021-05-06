package obloja.oana.as.singleton;

public class ConexiuneAPI {
	
	String url;
	
  private static ConexiuneAPI conexiune = null;
	
	private ConexiuneAPI() {
		
	}

	private ConexiuneAPI(String url) {
		System.out.println("Apel constructor");
		this.url = url;
	}
	
	public static synchronized ConexiuneAPI getConexiune() {
		if(conexiune == null) {
			conexiune = new ConexiuneAPI("http://127.0.0.1:5000/");
		}
		return conexiune;
	}

}
