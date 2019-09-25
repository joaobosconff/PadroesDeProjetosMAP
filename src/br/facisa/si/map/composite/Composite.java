package br.facisa.si.map.composite;
import java.util.ArrayList;

public abstract class Composite extends Component{
	
	
	private ArrayList<Component> array = new ArrayList<>();
	
	
	public void add(Component component) {
		array.add(component);
	}
	
	public void remove(Component component) {
		array.remove(component);
	}
	
	public void getChild() {
		for (Component component : array) {
			System.out.println(component);
		}
	}
	

}
