package company.model.milkProduct;

import company.model.Product;

import java.time.LocalDate;

public class Milk extends Product {
    public Milk() {
    }

    public Milk(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
