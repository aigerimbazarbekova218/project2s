package company.model.wheatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Pasta extends Product {
    public Pasta() {
    }

    public Pasta(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
