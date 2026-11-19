package kh.edu.istad.postgresdb_elearning_a01_m2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "videos")
@Getter
@Setter
@NoArgsConstructor
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String duration;
    private Boolean isDeleted = false;
    private Boolean isPublished = false;
    private String slug;
    private String thumbnail;
    private String title;
    private String youtube;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
