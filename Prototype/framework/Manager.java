package framework;
import java.util.*;

public class Manager {
    private HashMap<String, Product> showcase = new HashMap<String, Product>();

    public void register(String name, Product proto) {
	this.showcase.put(name, proto);
    }

    public Product create(String protoname) {
	Product p = showcase.get(protoname);
	return p.createClone();
    }
}