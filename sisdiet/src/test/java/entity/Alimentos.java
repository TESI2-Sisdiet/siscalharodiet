package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alimentos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idAlimento;
	
	@Column
	private String NomeAlimento;
	
	@Column
	private String DescAlimento;
	
	@Column
	private double CalAlimento;
	
	@Column
	private String porcao; 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idAlimento == null) ? 0 : idAlimento.hashCode());
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
		Alimentos other = (Alimentos) obj;
		if (idAlimento == null) {
			if (other.idAlimento != null)
				return false;
		} else if (!idAlimento.equals(other.idAlimento))
			return false;
		return true;
	}
	
	public Integer getIdAlimento() {
		return idAlimento;
	}
	
	public void setIdAlimento(Integer idAlimento) {
		this.idAlimento = idAlimento;
	}
	
	public String getNomeAlimento() {
		return NomeAlimento;
	}
	
	public void setNomeAlimento(String nomeAlimento) {
		this.NomeAlimento = nomeAlimento;
	}
	
	public String getDescAlimento() {
		return DescAlimento;
	}
	
	public void setDescAlimento(String descAlimento) {
		this.DescAlimento = descAlimento;
	}
	
	public double getCalAlimento() {
		return CalAlimento;
	}
	
	public void setCalAlimento(double CalAlimento) {
		this.CalAlimento = CalAlimento;
	}
	
	public String getPorcao() {
		return porcao;
	}
	
	public void setPorcao(String porcao) {
		this.porcao = porcao;
	}
	
}
