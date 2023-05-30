package company.model.wheatProduct;

import company.model.Product;

import java.time.LocalDate;

public class Flour extends Product {
    public Flour() {
    }

    public Flour(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
