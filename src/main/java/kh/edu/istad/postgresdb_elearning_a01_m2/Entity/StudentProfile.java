package kh.edu.istad.postgresdb_elearning_a01_m2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_profiles")
@Getter
@Setter
@NoArgsConstructor
public class StudentProfile {

    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    private String biography;
    private String facebookLink;
    private String githubLink;
    private String major;
    private String phoneNumber;
    private String university;
}