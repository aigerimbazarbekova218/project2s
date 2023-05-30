package company.model.meatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Fish extends Product {
    public Fish() {
    }

    public Fish(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
