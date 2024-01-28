package com.example.JpaLibrary.controller;

import com.example.JpaLibrary.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction/issue")
    public String issueTxn(@RequestParam("name") String name, @RequestParam("studentId") int studentId) throws Exception {
        return transactionService.issueTxn(name, studentId);
    }

    @PostMapping("/transaction/return")
    public String returnTxn(@RequestParam("bookId") int bookId, @RequestParam("studentId") int studentId) throws Exception {
        return transactionService.returnTxn(bookId, studentId);
    }

}

    //ISSUANCE
    //RETURN
 /*   @Autowired
    TransactionService transactionService;

    @PostMapping("/issue")
    public String issueTxn(@RequestParam("name") String name,
                           @RequestParam("studentId")int studentId) throws Exception{
        return transactionService.issueTxn(name,studentId);
    }
    @PostMapping("/return")
    public String returnTxn(@RequestParam("bookId") int bookId,
                           @RequestParam("studentId")int studentId) throws Exception{
        return transactionService.returnTxn(bookId,studentId);
    }*/

//}
