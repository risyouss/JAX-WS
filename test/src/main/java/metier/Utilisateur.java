package metier;
import java.io.Serializable;

import service.FormationService;
public class Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;
    private String nom;
    private String prenom;
    private String email;
    private FormationService formation;

    public Utilisateur(String nom, String prenom, String email, FormationService formation2) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.formation = formation2;
    }

    public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, Formation formation2) {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FormationService getFormation() {
        return formation;
    }

    public void setFormation(FormationService formation) {
        this.formation = formation;
    }
}