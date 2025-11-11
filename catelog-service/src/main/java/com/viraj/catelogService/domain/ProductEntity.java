package com.viraj.catelogService.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_generator")
    @SequenceGenerator(name = "product_id_generator" , sequenceName = "product_id_generator")
    private long id;

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "product is required!!")
    private String code;

    @Column(nullable = false)
    @NotEmpty(message = "product name is required!!")
    private String name;

    private String description;

    private String imageUrl;

    @Column(nullable = false)
    @DecimalMin("0.1")
    @NotNull(message = "product price is required!!")
    private BigDecimal price;


}
