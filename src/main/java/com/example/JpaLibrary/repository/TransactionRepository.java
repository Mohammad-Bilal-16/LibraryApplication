package com.example.JpaLibrary.repository;

import com.example.JpaLibrary.models.Book;
import com.example.JpaLibrary.models.Enums.TransactionStatus;
import com.example.JpaLibrary.models.Enums.TransactionType;
import com.example.JpaLibrary.models.Student;
import com.example.JpaLibrary.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction , Integer> {

    Transaction findTopByStudentAndBookAndTransactionTypeAndTransactionStatusOrderByTransactionTimeDesc(
            Student student, Book book, TransactionType transactionType, TransactionStatus transactionStatus
    );
}
