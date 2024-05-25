package itetratorIterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Product> {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);

    }
    @Override
    public Iterator<Product> iterator() {
        return new ProductItetrator(products);
    }
}

