package company.model.meatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Meat extends Product {
    public Meat() {
    }

    public Meat(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
