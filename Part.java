package warehousev3_0;

public class Part extends Component{

	private CatalogueEntry catEntry;
	
	public Part(CatalogueEntry catEnt) {
		catEntry = catEnt;
	}

	@Override
	public double cost() {
		
		return catEntry.getCost();
	}

}
