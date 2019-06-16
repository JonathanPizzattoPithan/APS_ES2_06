package Maven.APs_GB;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras{

	private int ID;
	private float ValorTotal;
	public String Not = " ";
	
	
	ArrayList <Figures> ListaC = new ArrayList <Figures>();

	public float getValorTotal() {
		ValorFinal();
		return ValorTotal;
	}
	
	public void ValorFinal(){
		int i;
		ValorTotal = 0;
		for(i=0;i<ListaC.size();i++) {
			ValorTotal = ValorTotal + ListaC.get(i).getPreco();
		}
	}
	
	public void MostraTodos() {
		for(int i = 0; i < ListaC.size(); i++) {
			System.out.println(ListaC.get(i).toString());
		}
	}
	
	public void Adiciona(Object P) {
		ListaC.add((Figures) P);
		Not = " o item selecioando foi adicionado com secesso a sua lista de compras !";
		notifyObservers();
	}
	
	public void Remove(Object R) {
		ListaC.remove((Figures) R);
		Not = " o item selecioando foi removido com secesso da sua lista de compras !";
		notifyObservers();
	}
	
	List<IObserver> observerList = new ArrayList<IObserver>();
	
	
	public void register(IObserver o) {
		
		observerList.add(o);
	}

	
	public void unregister(IObserver o) {
		
		observerList.remove(o);
		
	}

	public void notifyObservers() {
		
		for(int i=0; i<observerList.size(); i++) {
		
				observerList.get(i).update(Not);
			
		}
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
