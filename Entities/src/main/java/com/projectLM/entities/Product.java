package com.projectLM.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "units")
    private Units units;
    @Column(name = "desc")
    private String desc;
    @Column(name = "display_name")
    private String displayName;
    @JoinColumn(name = "status")
    private Status status;
    @Column(name = "created_time")
    private LocalDateTime createdTime;
    @Column(name = "updated_time")
    private LocalDateTime updated_time;





}
