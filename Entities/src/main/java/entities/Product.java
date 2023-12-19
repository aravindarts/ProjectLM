package entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.context.annotation.Primary;

import java.io.Serializable;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;





}
