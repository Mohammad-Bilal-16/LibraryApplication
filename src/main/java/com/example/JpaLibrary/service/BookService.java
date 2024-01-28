package com.example.JpaLibrary.service;

import com.example.JpaLibrary.dtos.SearchBookRequest;
import com.example.JpaLibrary.models.Author;
import com.example.JpaLibrary.models.Book;
import com.example.JpaLibrary.models.Enums.Genre;
import com.example.JpaLibrary.models.Student;
import com.example.JpaLibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorService authorService;

    public Book createBook(Book book) {

        Author author = authorService.createOrGet(book.getMy_author());
        book.setMy_author(author);

        return bookRepository.save(book);
    }
    public void assignBookToStudent(Book book, Student student) {
        bookRepository.assignBookStudent(book.getId(), student);
    }
    public Book deleteById(int id) {
        Book book = this.bookRepository.findById(id).orElse(null);
        bookRepository.deleteById(id);
        return book;
    }
    public List<Book> getBookALl() {
        return bookRepository.findAll();
    }
    public Book getById(int id) {
        return bookRepository.findById(id).orElse(null);
    }
    public void unassignBookFromStudent(Book book) {
        bookRepository.unassignBook(book.getId());
    }
    public List<Book> search(SearchBookRequest searchBookRequest) throws Exception{
    /*    boolean isValidRequest = searchBookRequest.validate();
        if (!isValidRequest){
            throw new Exception("Invalid Request");
        }*/
        String sql = "select b from book b where b.searchKey searchOperator searchValue";
        switch (searchBookRequest.getSearchKey()){
            case "name":
                if(searchBookRequest.isAvailable()){
                    return bookRepository.findByNameAndmy_StudentIdIsNull(searchBookRequest.getSearchValue());
                }
                return bookRepository.findByName(searchBookRequest.getSearchValue());
            case "genre":
                return bookRepository.findByGenre(Genre.valueOf(searchBookRequest.getSearchValue()));
            case "id":{
                Book book = bookRepository.findById(Integer.parseInt(searchBookRequest.getSearchValue())).orElse(null);
                return Arrays.asList(book);
            }
            default:
                throw new Exception("Invalid search key");
        }
    }

}
