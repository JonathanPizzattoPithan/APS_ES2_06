package Maven.APs_GB;

import org.junit.Test;

import junit.framework.TestCase;

public class TestesCliente extends TestCase{
	
	Cliente T0 = new Cliente();
	
	@Test
	public void teste_CPF() {
		
		String F1 = "11111111111";
		T0.setCPF(22222222222L);
		String F2 = "" + T0.getCPF();
		
		assertTrue(F1.length() == F2.length());
		
	}
	
	@Test
	public void teste_Nome() {
		
		T0.setNome("José");
		assertTrue(SoLetras(T0.getNome()));
		
	}
	
	public boolean SoLetras(String g) {
		boolean p = false;
		 if (g.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$")) {
			 p = true;
		 }
		return p;
	}
	
	@Test
	public void teste_Telefone() {
		
		String F1 = "33987624";
		T0.setTelefone(33555555);
		String Y1 = "" + T0.getTelefone();
		
		assertTrue(F1.length() == Y1.length());
		
	}
	
	@Test
	public void teste_Endereco() {
		
		T0.setEndereco("POA");
		assertFalse(StringNull(T0.getEndereco()));
		
	}
	
	public boolean StringNull(String g) {
		boolean p = false;
		 if (g.isEmpty()) {
			 p = true;
		 }
		return p;
	}
	
}
