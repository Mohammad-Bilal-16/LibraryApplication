package com.example.JpaLibrary.controller;

import com.example.JpaLibrary.dtos.BookResponse;
import com.example.JpaLibrary.dtos.CreateBookRequest;
import com.example.JpaLibrary.dtos.SearchBookRequest;
import com.example.JpaLibrary.models.Book;
import com.example.JpaLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("")
    public Book craeteBook(@RequestBody @Valid CreateBookRequest createBookRequest){
        return bookService.createBook(createBookRequest.to());
    }
    @DeleteMapping("/{id}")
    public BookResponse deleteBookById(@PathVariable("id") int id){
        return BookResponse.from(bookService.deleteById(id));
    }
    @GetMapping("/search")
    public List<Book> getBookByAuthor(@RequestBody @Valid SearchBookRequest searchBookRequest) throws Exception{
        return bookService.search(searchBookRequest);
    }
    @GetMapping("")
    public List<Book> getBookByAll(){
        return bookService.getBookALl();
    }
    @GetMapping("/{id}")
    public Book getById(int id){
        return bookService.getById(id);
    }

}
