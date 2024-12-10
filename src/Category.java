import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Category {

    private String name;
    private String description;
    private List<Product> products;
    private int count;
    private Set<Product> uniqProducts = new HashSet<>(products);

    public Category() {
    }

    public Category(String name, String description, List<Product> products) {
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getCount() {
        return products.size();
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUniqProducts() {
        return uniqProducts.size();
    }

    public void setUniqProducts(Set<Product> uniqProducts) {
        this.uniqProducts = uniqProducts;
    }
}
