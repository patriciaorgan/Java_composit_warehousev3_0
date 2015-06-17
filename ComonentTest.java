package warehousev3_0;

import static org.junit.Assert.*;
import org.junit.Test;

public class ComonentTest {

	@Test
	public void test() {
		
		//declare and initialize  a few CatalogueEntry objects
		CatalogueEntry bolt = new CatalogueEntry("bolt", 6892, 0.02);
		CatalogueEntry screw = new CatalogueEntry("screw", 6882, 0.03);
		CatalogueEntry nail = new CatalogueEntry("nail", 6802, 0.01);
		
		//declare and initialize a service object that extends component
		Service s1 = new Service("Regular Maintenance", 1234, 300.50);
		
		//toplevel assembley that extends component
		Assembly assembly1 = new Assembly();
		
		//create more assemblys that extends component
		Assembly assembly2 = new Assembly();
		Assembly assembly3 = new Assembly();
		Assembly assembly4 = new Assembly();
		
		//loop to initialise some parts and add all the parts to the various assemblys
		for (int i = 0; i < 100; i++){
			assembly3.add(new Part(screw)); //cost should be 3.00
			assembly4.add(new Part(nail));  //cost should be 1.00
			assembly2.add(new Part(bolt)); //cost should  be 2.00
			assembly1.add(new Part(bolt)); //cost should  be 2.00
		}									 //total parts = 8.00
		
		//add service to main assembly1
		assembly1.add(s1); //cost should  be 300.50, + parts 8.00 = 308.50
		
		//add assemblys to main assembly1
		assembly1.add(assembly3);
		assembly1.add(assembly2);
		
		//add assembly4 to assembly3 who is already added to assembly1
		assembly3.add(assembly4);
		
		//create a variable and set it to the correct cost
		double actual = 308.5;
		
		//create a variable to assign the over all cost of the main assembly, 
		//this should be a combination of all the are added to it
		double out = assembly1.cost();
		
		//JUnit test using assert with accuracy of 0.001
		assertEquals(actual, out, 0.001);	
		
	}//end JUnitTest method

}//end ComponenetTest Class
