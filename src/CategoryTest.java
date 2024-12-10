import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CategoryTest {

    List<Product> products;
    private Product product;
    private Product product1;
    private Product product2;

    @Before
    public void setUp() {

        product = new Product("Poco", "PocoX3ProMaxUltraSuperUltimateC4PlantBomb", 29.99F, 10);
        product1 = new Product("Infinix", "Infinix11ProMax", 11.99F, 30);
        product2 = new Product("Xiaomi", "Note36ProUltraKiller", 15.99F, 5);

        products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);

    }

    @Test
    public void getCount() {

    }

    @Test
    public void getUniqProducts() {
        List<Product> productsActual = new ArrayList<>();
        productsActual.add(product);
        productsActual.add(product1);
        productsActual.add(product2);

        assertEquals(productsActual.size(), products.size());
    }
}