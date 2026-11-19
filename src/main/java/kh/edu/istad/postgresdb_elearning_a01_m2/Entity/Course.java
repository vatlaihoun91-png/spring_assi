package kh.edu.istad.postgresdb_elearning_a01_m2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer countRating;
    private LocalDateTime createdAt;
    private String description;
    private Float discountPercent;
    private Boolean isDeleted = false;
    private Boolean isPublished = false;
    private String keyword;
    private String level;

    @Column(precision = 38, scale = 2)
    private BigDecimal price;

    private String slug;
    private Float starRating;
    private String thumbnail;
    private String title;
    private Float totalHours;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;
}
