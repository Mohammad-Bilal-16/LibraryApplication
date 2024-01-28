package com.example.JpaLibrary.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String email;

    private String name;

    private String country;

    @CreationTimestamp
    private Date updatedOn;

    @OneToMany(mappedBy = "my_author")
    @JsonIgnoreProperties({"my_author"})
    private List<Book> bookList;
}
