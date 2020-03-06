package com.Zolfaghar.onlinebookstore.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="tbl_book")
@Setter
@Getter
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String sku;

    private String name;

    private String description;
    @Column(name="unit_price")
    private BigDecimal unitPrice;
    @Column(name="image_url")
    private String imageUrl;

    private boolean active;
    @Column(name="units_in_stock")
    private int unitsInStock;
    @Column(name="data_created")
    private Date createdOn;
    @Column(name="last_updated")
    private Date updatedOn;

    @ManyToOne
    @JoinColumn(name="category_id",nullable = false)
    private BookCategory category;
}
