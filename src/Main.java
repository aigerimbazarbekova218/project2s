import company.model.CompanyName;
import company.model.Product;
import company.model.meatProduct.Fish;
import company.model.meatProduct.Meat;
import company.model.meatProduct.Sausage;
import company.model.milkProduct.Kefir;
import company.model.milkProduct.Milk;
import company.model.milkProduct.Yogurt;
import company.model.wheatProduct.Bread;
import company.model.wheatProduct.Flour;
import company.model.wheatProduct.Pasta;
import company.service.impl.impl.ProductServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product>products=new ArrayList<>(Arrays.asList(
                new Fish(1,"Fish",CompanyName.TOIBOSS.name(), LocalDate.of(2023,4,25)),
                new Meat(2,"Meat",CompanyName.TOIBOSS.name(), LocalDate.of(2023,4,28)),
                new Sausage(3,"Sausage",CompanyName.TOIBOSS.name(), LocalDate.of(2023,4,21)),
                new Kefir(4,"Kefir",CompanyName.MILKA.name(), LocalDate.of(2023,4,15)),
                new Milk(5,"Milka",CompanyName.MILKA.name(), LocalDate.of(2023,4,18)),
                new Yogurt(6,"Yogurt",CompanyName.MILKA.name(),LocalDate.of(2023,5,12)),
                new Bread(7, "Bread", CompanyName.NUR.name(), LocalDate.of(2023,4,20)),
                new Flour(8,"Flour",CompanyName.NUR.name(), LocalDate.of(2023, 5,13)),
                new Pasta(9,"Pasta",CompanyName.NUR.name(), LocalDate.of(2023,5,19))));


        ProductServiceImpl productService=new ProductServiceImpl();
        productService.addProducts(products);
        productService.sortByDate(products);
        productService.getAllProducts();



    }
}