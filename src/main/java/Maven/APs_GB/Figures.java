package Maven.APs_GB;

public class Figures{

	private String Nome;
	private float Preco;
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public float getPreco() {
		return Preco;
	}
	
	public void setPreco(float preco) {
		Preco = preco;
	}
	
	public String toString(){
		return Nome + "\n" + Preco + "\n";
	}
	
}
