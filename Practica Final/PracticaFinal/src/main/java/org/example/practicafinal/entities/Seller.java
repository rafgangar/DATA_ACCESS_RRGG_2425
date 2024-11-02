package org.example.practicafinal.entities;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sellers_id_gen")
    @SequenceGenerator(name = "sellers_id_gen", sequenceName = "sellers_seller_id_seq", allocationSize = 1)
    @Column(name = "seller_id", nullable = false)
    private Integer id;

    @Column(name = "cif", nullable = false, length = 20)
    private String cif;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "business_name", length = 100)
    private String businessName;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "email", length = 90)
    private String email;

    @Column(name = "plain_password", nullable = false, length = 50)
    private String plainPassword;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @OneToMany(mappedBy = "seller")
    private Set<SellerProduct> sellerProducts = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlainPassword() {
        return plainPassword;
    }

    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<SellerProduct> getSellerProducts() {
        return sellerProducts;
    }

    public void setSellerProducts(Set<SellerProduct> sellerProducts) {
        this.sellerProducts = sellerProducts;
    }

}