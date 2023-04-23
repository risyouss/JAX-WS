package serveur;
import javax.xml.ws.Endpoint;
import service.FormationService;
public class ServeurWS {

	public static void main(String[] args) {
		String url="http://localhost:7000/";
		Endpoint.publish(url , new FormationService());
		System.out.println("Server on");
	}
}
