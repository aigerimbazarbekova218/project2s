package company.service.impl.impl;

import company.dao.ProductDao;
import company.model.Product;
import company.service.impl.ProductService;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao = new ProductDao();

    @Override
    public void addProducts(List<Product> products) {
        products.stream().filter(product -> product.getCompanyName().equalsIgnoreCase("MILKA")
                        || product.getCompanyName().equalsIgnoreCase("TOIBOSS")
                        || product.getCompanyName().equalsIgnoreCase("NUR")).
                filter(product -> product.getDeadline().isAfter(LocalDate.now().minusMonths(1))).
                forEach(productDao.getProducts()::add);
    }

    @Override
    public void sortByDate(List<Product> products) {
        LinkedList<Product> list = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDeadline().isBefore(LocalDate.now())) {
                list.remove(list.get(i));
            }
        }
        products.stream().filter(product -> product.getDeadline()
                        .minusMonths(1).plusDays(7).isAfter(LocalDate.now()))
                .forEach(productDao.getDiscountProjects()::add);
        System.out.println(productDao.getDiscountProjects());
    }

    @Override
    public void getAllProducts() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("write a login");
        String username = scanner.nextLine();
        System.out.println("write the password");
        String password= scanner.nextLine();
        if (productDao.getManager().getLogin().equals(username) &&
                productDao.getManager().getPassword().equals(password)){
            System.out.println(productDao.getProducts());
        }else {
            System.out.println("You entered the wrong username and password, try again");
        }

    }
}
