package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;



    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private Long quantity;


    protected Security() {}

    public Security(Portfolio portfolio, String name, String category, Double purchasePrice, LocalDate purchaseDate, Long quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() { return securityId; }

    public Portfolio getPortfolio() { return portfolio;}

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio;}

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public String getCategory() { return category;}

    public void setCategory(String category) {this.category = category;}

    public double getPurchasePrice() { return purchasePrice;}

    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice;}

    public LocalDate getPurchaseDate() { return purchaseDate;}

    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate;}

    public Long getQuantity() { return quantity;}

    public void setQuantity(Long quantity) { this.quantity = quantity;}

}
