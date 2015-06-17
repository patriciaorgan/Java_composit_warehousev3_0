package warehousev3_0;

public class CatalogueEntry {

	private String name;
	private int id;
	private double cost;
	
	public CatalogueEntry(String nm, int i, double d) {
		name = nm;
		id = i;
		cost = d;
	}

	public double getCost() {
		return cost;
	}
	
	public String getName (){
		return name;
	}
	
	public int getID(){
		return id;
	}
}
