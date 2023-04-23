package metier;
import java.io.Serializable;
public class Registre implements Serializable {
    private static final long serialVersionUID = 2L;
    private Long code;
    private String nomCours;
    private Integer totalInscriptions;
    private String temps;
    
    public Registre() {
    }
    
    public Registre(Long code, String nomCours, Integer totalInscriptions, String temps) {
        this.code = code;
        this.nomCours = nomCours;
        this.totalInscriptions = totalInscriptions;
        this.temps = temps;
    }
    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }
    public String getNomCours() {
        return nomCours;
    }
    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }
    public Integer getTotalInscriptions() {
        return totalInscriptions;
    }
    public void setTotalInscriptions(Integer totalInscriptions) {
        this.totalInscriptions = totalInscriptions;
    }
    public String getTemps() {
        return temps;
    }
    public void setTemps(String temps) {
        this.temps = temps;
    }
}
