package Maven.APs_GB;

public class Principal {

	public static void main(String[] args) {
		
		Cliente P1 = new Cliente();
		Cliente P2 = new Cliente();
		
		P1.setNome("Maria");
		P1.setCPF(12345678912L);
		P1.setTelefone(33111111);
		P1.setEndereco("Rua patatipatatá 22");
		
		//System.out.println(P1.getNome() + "\n" + P1.getCPF() + "\n" + P1.getEndereco() + "\n" + P1.getTelefone()+ "\n");
		System.out.println(P1.toString());
		
		P2.setNome("João");
		P2.setCPF(43215678912L);
		P2.setTelefone(33117777);
		P2.setEndereco("Rua patatipatatá 37");
		
		//System.out.println(P2.getNome() + "\n" + P2.getCPF() + "\n" + P2.getEndereco() + "\n" + P2.getTelefone()+ "\n");
		System.out.println(P2.toString());
		
		Figures N1 = new Figures();
		N1.setNome("Dio");
		N1.setPreco(175.50F);
		
		//System.out.println(N1.getNome() + "\n" + N1.getPreco() + "\n");
		System.out.println(N1.toString());
		
		Figures N2 = new Figures();
		N2.setNome("Jonathan");
		N2.setPreco(197.70F);
		
		//System.out.println(N2.getNome() + "\n" + N2.getPreco() + "\n");
		System.out.println(N2.toString());
		
		Figures N3 = new Figures();
		N3.setNome("Joseph");
		N3.setPreco(223.50F);
		
		//System.out.println(N3.getNome() + "\n" + N3.getPreco() + "\n");
		System.out.println(N3.toString());
		
		ListaDeCompras L1 = new ListaDeCompras();
		L1.setCliente(P1.getNome());
		L1.ListaC.add(N2);
		L1.ListaC.add(N3);
		
		System.out.println("/////////////////////////\n");
		//System.out.println(L1.getCliente() + "\n\n" + L1.ListaC.get(0).toString() + "\n" + L1.ListaC.get(1).toString());
		L1.MostraTodos();
		
		System.out.println(L1.ListaC.size() + "\n");
		
		System.out.println(L1.getValorTotal()+ "\n");
		
		L1.ListaC.add(N1);
		
		System.out.println(L1.getValorTotal()+ "\n");
		
		L1.ListaC.add(N2);
		
		System.out.println(L1.getValorTotal()+ "\n");
		
		System.out.println("/////////////////////////\n");
		
		L1.MostraTodos();
		System.out.println(L1.getValorTotal()+ "\n");
		
		System.out.println("/////////////////////////\n");
		
		L1.ListaC.remove(N1);
		
		L1.MostraTodos();
		System.out.println(L1.getValorTotal()+ "\n");
		
		System.out.println("/////////////////////////\n");
		
		L1.ListaC.remove(N2);
		
		L1.MostraTodos();
		System.out.println(L1.getValorTotal()+ "\n");
	}

}
