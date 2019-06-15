package Maven.APs_GB;



import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumerosAleatorios{

    public int NumerosA(int N1) {
        
    	int M1;
    	Random r = new Random();
    	M1 = r.nextInt(100);
    	if(M1 > 60) {
    		N1 = 60;
    	}else {
    		N1 = M1;
    	}
    	
    	return N1;
    	
    }
}