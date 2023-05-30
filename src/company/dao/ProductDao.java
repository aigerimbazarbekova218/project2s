package company.dao;

import company.model.Manager;
import company.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product>products=new ArrayList<>();
    private List<Product> discountProjects=new ArrayList<>();
    private Manager manager=new Manager("1234","Aigerim");

    public ProductDao(List<Product> products, List<Product> discountProjects) {
        this.products = products;
        this.discountProjects = discountProjects;
    }

    public ProductDao(Manager manager) {
        this.manager = manager;
    }

    public ProductDao() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getDiscountProjects() {
        return discountProjects;
    }

    public void setDiscountProjects(List<Product> discountProjects) {
        this.discountProjects = discountProjects;
    }

    @Override
    public String toString() {
        return "ProductDao{" +
                "products=" + products +
                ", discountProjects=" + discountProjects +
                ", manager=" + manager +
                '}';
    }
}
