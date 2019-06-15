package Maven.APs_GB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	NumerosAleatorios P1 = new NumerosAleatorios();
    	int N2 = 0;
    	
    	N2 = P1.NumerosA(N2);
    	
        System.out.println(TesteA(null));
        System.out.println(N2);
        
    }
    
    public static String TesteA(String B) {
    	
    	String H = new String("Hello, World");
    	B = H;
    	return B;
    	
    }
}
