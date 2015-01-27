package entity ;


import java.io.Serializable;
import java.sql.Array;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class ItemDieta implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idItemDieta;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="idAlimento",name="fkAlimento")
	private Alimentos alimentos;
	
	public Dieta getDieta() {
		return dieta;
	}
	public void setDieta(Dieta dieta) {
		this.dieta = dieta;
	}
	@ManyToOne
	@JoinColumn(referencedColumnName="idDieta",name="fkDieta")
	private Dieta dieta;
	
	public Integer getIdItemDieta() {
		return idItemDieta;
	}
	public void setIdItemDieta(Integer idItemDieta) {
		this.idItemDieta = idItemDieta;
	}
	public Alimentos getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(Alimentos alimentos) {
		this.alimentos = alimentos;
	}

	
}