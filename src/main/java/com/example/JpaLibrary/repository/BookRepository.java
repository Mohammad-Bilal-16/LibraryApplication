package com.example.JpaLibrary.repository;

import com.example.JpaLibrary.models.Book;
import com.example.JpaLibrary.models.Enums.Genre;
import com.example.JpaLibrary.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByName(String name);
    @Query("select b from Book b where b.name =:name and b.my_student is null")
    List<Book> findByNameAndmy_StudentIdIsNull(String name);
    List<Book> findByGenre(Genre genre);

    @Modifying //for DML support
    @Transactional //for updating ant data
    @Query("update Book b set b.my_student = ?2 where b.id = ?1 and b.my_student is null")
    void assignBookStudent(int bookId, Student student);

    @Modifying // for DML support
    @Transactional // for updating any data
    @Query("update Book b set b.my_student = null where b.id = ?1")
    void unassignBook(int bookId);
}
