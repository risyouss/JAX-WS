package metier;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="cours")
public class Cours implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long code;
	private String Nom_cours;
	private Integer total_ins;
	private String temps;
	public Long getCode() {
		return code;
	}
	public void setCode (Long code) {
		this.code = code;
	}
	public String getNom_cours() {
		return Nom_cours;
	}
	public void setNom_cours(String nom_cours) {
		Nom_cours = nom_cours;
	}
	public Integer getTotal_ins() {
		return total_ins;
	}
	public void setTotal_ins(Integer total_ins) {
		
	}
	 public String getTemps() {
	        return temps;
	    }

	    public void setTemps(String temps) {
	        this.temps = temps;
	    }
	public Cours(Long code , String nom_cours , Integer total_ins) {
		super();
		this.code = code;
		Nom_cours = nom_cours ;
		this.total_ins = total_ins;
	}
	public Cours() {
		super();
	}
	
}
