package metier;
import java.util.*;
public class Formation {
    private String codeFormation;
    private String intitule;
    private double fraisInscriptionAnnuelle;
    private List<Cours> cours;
    private List<Utilisateur> utilisateurs;

    public Formation(String codeFormation, String intitule, double fraisInscriptionAnnuelle, List<Cours> cours) {
        this.codeFormation = codeFormation;
        this.intitule = intitule;
        this.fraisInscriptionAnnuelle = fraisInscriptionAnnuelle;
        this.cours = cours;
        this.utilisateurs = new ArrayList<>();
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getFraisInscriptionAnnuelle() {
        return fraisInscriptionAnnuelle;
    }

    public void setFraisInscriptionAnnuelle(double fraisInscriptionAnnuelle) {
        this.fraisInscriptionAnnuelle = fraisInscriptionAnnuelle;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}