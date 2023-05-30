package company.model.milkProduct;

import company.model.Product;

import java.time.LocalDate;

public class Kefir extends Product {
    public Kefir() {
    }

    public Kefir(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
