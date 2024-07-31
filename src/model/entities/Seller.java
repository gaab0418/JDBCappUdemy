package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String email;
    private Date bithDay;
    private Double baseSalary;
    private Department department;

    public Seller() {}

    public Seller(int id, String name, String email, Date bithDay, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bithDay = bithDay;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bithDay=" + bithDay +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return id == seller.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithDay() {
        return bithDay;
    }

    public void setBithDay(Date bithDay) {
        this.bithDay = bithDay;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
