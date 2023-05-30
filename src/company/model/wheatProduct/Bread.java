package company.model.wheatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Bread extends Product {
    public Bread() {
    }

    public Bread(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
