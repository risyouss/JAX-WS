package service;
import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import metier.*;
	@WebService(name="FormationWS")
public class FormationService {
		 private static final Map<Long, Double> COURS_prix = new HashMap<>();
		static {
		        COURS_prix.put(123L, 1000.0);
		        COURS_prix.put(456L, 800.0);
		        COURS_prix.put(789L, 500.0);
		    }
	@WebMethod(operationName="Frais_Dinscription")
	public double frais_Insci_Cours(@WebParam(name="code")Long cd) {
		 return COURS_prix.getOrDefault(cd, 0.0);
		}
	@WebMethod
	public Cours getCours(@WebParam(name="code")Long cd) {
	    return new Cours(cd,cournew,11);
	}
	
	@WebMethod
	public List<Cours> getAllCours(){
		List<Cours> listeCr=new ArrayList<>();
		listeCr.add(new Cours(2L , "Big data",30));
		listeCr.add(new Cours (3L , "Data management",30));
		listeCr.add(new Cours(2L , "informatique décisionnelle",30));
		listeCr.add(new Cours (3L , "Programmation avancée",30));
		listeCr.add(new Cours(2L , "Théorie de l'information",30));
		listeCr.add(new Cours (3L , "Web Service",30));
		return listeCr;
	}
	/*@WebMethod
	public boolean register(@WebParam(name = "code") Long code,
	                         @WebParam(name = "nom_cours") String nomCours,
	                         @WebParam(name = "total_ins") Integer totalInscriptions,
	                         @WebParam(name = "temps") String temps) {
	    register = new Registre(code, nomCours, totalInscriptions, temps);
	    /**/
	   // return true;}*/
	
	
	/*@WebMetho
	public String inscrireUtilisateur(String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, String codeFormation) {
	    c = codeFormation;
		for (Cours c : cours) {
	        if (c.getCode().equals(codeformation)) {
	            formation = c;
	            break;
	        }
	    }
	    if (c == null) {
	        return "La formation demandée n'existe pas";
	    }

	   
	    Utilisateur utilisateur = new Utilisateur(nomUtilisateur, prenomUtilisateur, emailUtilisateur, formation);

	    
	    formation.getUtilisateurs().add(utilisateur);
	    String message = "Bonjour " + prenomUtilisateur + ",\n\n"
	            + "Nous avons bien enregistré votre inscription à la formation " + formation.getIntitule() + ".\n"
	            + "Le montant de votre inscription s'élève à " + formation.getFraisInscriptionAnnuelle() + " euros.\n\n"
	            + "Cordialement,\nL'équipe de formation.";
	    sendEmail(emailUtilisateur, "Confirmation d'inscription", message);

	    return "Inscription confirmée pour " + nomUtilisateur + " " + prenomUtilisateur;
	}

	private void sendEmail(String email, String sujet, String message) {
	   
	}*/

}