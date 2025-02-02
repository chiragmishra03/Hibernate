package org.example;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int rollNo;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_age")
    private int sAge;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate createdAt;

    @Lob
    private byte[] image;

}
