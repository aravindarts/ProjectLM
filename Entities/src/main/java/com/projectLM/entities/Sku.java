package com.projectLM.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "sku")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Sku {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "product")
    private Product product;
    @Column(name = "stock")
    private Double stock;
    @JoinColumn(name = "units")
    private Units units;
    @Column(name = "PRBT")
    private Double PRBT;
    @Column(name = "PRAT")
    private Double PRAT;
    @Column(name = "SRBT")
    private Double SRBT;
    @Column(name = "SRAT")
    private Double SRAT;
    @Column(name = "MRP")
    private Double MRP;
    @JoinColumn(name = "status")
    private Status status;
    @Column(name = "created_time")
    private LocalDateTime createdTime;
    @Column(name = "updated_time")
    private LocalDateTime updatedTime;



}
