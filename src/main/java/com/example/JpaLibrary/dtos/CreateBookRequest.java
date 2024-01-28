package com.example.JpaLibrary.dtos;

import com.example.JpaLibrary.models.Author;
import com.example.JpaLibrary.models.Book;
import com.example.JpaLibrary.models.Enums.Genre;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateBookRequest {

    @NotBlank
    private String name;

    @NotNull
    private Genre genre;

    private Integer pages;

    @NotBlank
    private String author_name;

    private String author_country;

    @NotBlank
    private String author_email;

    public Book to(){
        return Book.builder()
                .name(this.name)
                .genre(this.genre)
                .pages(this.pages)
                .my_author(
                        Author.builder()
                                .name(this.author_name)
                                .country(this.author_country)
                                .email(this.author_email)
                                .build()
                )
                .build();
    }
}
