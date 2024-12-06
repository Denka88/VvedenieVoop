import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Category {

    private String name;
    private String description;
    private List<Product> products;
    private int count = products.size();
    private Set<Product> uniqProducts = new HashSet<>(products);

    public Category() {
    }

    public Category(String name, String description, List<Product> products, int count, int uniqProducts) {
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
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Set<Product> getUniqProducts() {
        return uniqProducts;
    }

    public void setUniqProducts(Set<Product> uniqProducts) {
        this.uniqProducts = uniqProducts;
    }
}
