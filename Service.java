package warehousev3_0;

public class Service extends Component{

	private String name;
	private int id;
	private double cost;
	
	public Service(String name, int id, double cost) {
		this.name = name;
		this.id = id;
		this.cost = cost;
	}
	
	@Override
	public double cost(){
		return cost;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}	

}
