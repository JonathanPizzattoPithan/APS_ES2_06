package Maven.APs_GB;

import java.util.ArrayList;

public class ListaDeCompras {

	private String Cliente;
	private float ValorTotal;
	
	
	ArrayList <Figures> ListaC = new ArrayList <Figures>();

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

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
	
	
}
