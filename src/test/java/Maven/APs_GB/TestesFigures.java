package Maven.APs_GB;

import org.junit.Test;

import junit.framework.TestCase;

public class TestesFigures extends TestCase{

	Figures T1 = new Figures();
	
	@Test
	public void test_Nome() {
		T1.setNome("002");
		assertFalse(StringNull(T1.getNome()));
	}
	
	@Test
	public void test_Preco() {
		T1.setPreco(167.34F);
		assertTrue(T1.getPreco()>=0);
		
	}
	
	public boolean StringNull(String g) {
		boolean p = false;
		 if (g.isEmpty()) {
			 p = true;
		 }
		return p;
	}

}
