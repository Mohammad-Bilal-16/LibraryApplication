package com.example.JpaLibrary.dtos;

import com.example.JpaLibrary.models.Author;
import com.example.JpaLibrary.models.Book;
import com.example.JpaLibrary.models.Enums.Genre;
import com.example.JpaLibrary.models.Student;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {

    private int id;
    private String name;
    private Genre genre;
    private Integer pages;
    private Author my_author;
    private Student my_student;

    private Date createdOn;
    private Date updateOn;

    public static  BookResponse from(Book b){
        return BookResponse.builder()
                .id(b.getId())
                .name(b.getName())
                .genre(b.getGenre())
                .pages(b.getPages())
                .createdOn(b.getCreatedOn())
                .updateOn(b.getUpdateOn())
                .my_author(b.getMy_author())
                .my_student(b.getMy_student())
                .build();
    }
}
