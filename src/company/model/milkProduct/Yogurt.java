package company.model.milkProduct;

import company.model.Product;

import java.time.LocalDate;

public class Yogurt extends Product {
    public Yogurt() {
    }

    public Yogurt(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
