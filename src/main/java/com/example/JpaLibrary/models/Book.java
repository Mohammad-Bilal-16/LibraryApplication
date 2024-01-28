package com.example.JpaLibrary.models;

import com.example.JpaLibrary.models.Enums.Genre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Integer pages;

    @ManyToOne
   // @JoinColumn(name = "author_id")
    @JoinColumn
    @JsonIgnoreProperties({"bookList"})
    private Author my_author;

    @ManyToOne
    @JoinColumn
    private Student my_student;

    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private Date updateOn;

    @OneToMany(mappedBy = "book")
    @JsonIgnoreProperties({"book"})
    private List<Transaction> transactionList;

}
