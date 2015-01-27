package entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Dieta implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDieta;
	
	@Column(name="data")
	@Temporal(TemporalType.DATE)
	private Date dataItem;
	
	/*@OneToMany(mappedBy="ItemDieta")
	@Column
	private List<ItemDieta> itemdieta;

	public List<ItemDieta> getItemdieta() {
		return itemdieta;
	}

	public void setItemdieta(List<ItemDieta> itemdieta) {
		this.itemdieta = itemdieta;
	}
*/
	
	@ManyToOne
	@JoinColumn(referencedColumnName="idUser",name="fkidUser")
	private Usuario idusuario;

	

	public Usuario getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario) {
		this.idusuario = idusuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDieta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dieta other = (Dieta) obj;
		if (idDieta != other.idDieta)
			return false;
		return true;
	}


}