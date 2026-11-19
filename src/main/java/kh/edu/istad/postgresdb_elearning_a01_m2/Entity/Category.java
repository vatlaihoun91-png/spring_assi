package kh.edu.istad.postgresdb_elearning_a01_m2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String icon;

    @Column(nullable = false)
    private Boolean isDeleted = false;

    @Column(nullable = false, length = 50)
    private String name;
}
