package warehousev3_0;
import java.util.*; //required for ArrayList

public class Assembly extends Component{

	private ArrayList<Component> components;
	
	public Assembly(){
		components = new ArrayList<Component>();
	}
	
	public void add(Component component) {
		this.components.add(component);	
	}
	
	@Override
	public double cost() {
		double costs = 0;
		
		for (Component c: components){
			costs += c.cost();
		}
		return costs;
	}
	
	

}
