package company.model.meatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Sausage extends Product {
    public Sausage() {
    }

    public Sausage(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
