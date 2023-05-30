package company.model;

import java.time.LocalDate;

public abstract class Product {
    private int id;
    private String name;
    private String companyName;
    private LocalDate deadline;

    public Product() {
    }

    public Product(int id, String name, String companyName, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
