package Maven.APs_GB;

public class Cliente {

	private String Nome;
	private long CPF;
	private int Telefone;
	private String Endereco;
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public long getCPF() {
		return CPF;
	}
	
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public int getTelefone() {
		return Telefone;
	}
	
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	
	public String toString(){
		return Nome + "\n" + CPF + "\n" + Telefone + "\n" + Endereco + "\n";
	}
	
	
}
