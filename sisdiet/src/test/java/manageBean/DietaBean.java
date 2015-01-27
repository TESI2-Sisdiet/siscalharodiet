package manageBean;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;

import DAO.AlimentosDAO;
import DAO.DietaDAO;
import DAO.ItemDietaDAO;
import entity.Alimentos;
import entity.Dieta;
import entity.ItemDieta;


@ManagedBean(name="dietaBean")
@SessionScoped
public class DietaBean {
	private Dieta dieta;
	private DietaDAO dietaDAO = new DietaDAO();
	private ItemDieta item = new ItemDieta(); 
	private ItemDietaDAO itemdietaDAO = new ItemDietaDAO();
	public void gerenciarDieta(){
		dieta = new Dieta();
		
	}
	 
	public void additemDieta(ItemDieta itemDieta){
		itemdietaDAO.CadastrarItem(item);
		
		
	}
	
	public Dieta getGerenciaDieta(){
		if(dieta==null)
			dieta = new Dieta();
		return dieta;
	}
	
	public void setDieta(Dieta dieta){
		this.dieta = dieta;
		
	}
	
	private List<Dieta> listaDieta = null;
	
	private List<Dieta> filtroLista = null;
/*
	public List<Dieta> getListaDieta() {
		if(listaDieta == null)
			listaDieta = dietaDAO.listarAlimentos(); 
		return listaDieta;
	}
*/
	public void setListaDieta(List<Dieta> listaDieta) {
		this.listaDieta = listaDieta;
	}

	public List<Dieta> getFiltroLista() {
		return filtroLista;
	}

	public void setFiltroLista(List<Dieta> filtroLista) {
		this.filtroLista = filtroLista;
	}
	
	
	
	
	
	/*
	private DualListModel<String> listadieta;
    
    @PostConstruct
    public void init() {
        //Alimentos
        List<String> Alimentos = new ArrayList<String>();
        List<String> Dieta = new ArrayList<String>();
         
        Alimentos.add("Pudin");
        Alimentos.add("Bacon");
        Alimentos.add("Linguiça");
        Alimentos.add("Pão");
        Alimentos.add("Beringela");
        Alimentos.add("Bolo");
        Alimentos.add("Rolinho primavera");
         
        listadieta = new DualListModel<String>(Alimentos, Dieta);
         
    }
 
    public DualListModel<String> getlistadieta() {
        return listadieta;
    }
 
    public void setCities(DualListModel<String> listadieta) {
        this.listadieta = listadieta;
    }
     */
 

}
