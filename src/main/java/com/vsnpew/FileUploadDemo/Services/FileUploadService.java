package com.vsnpew.FileUploadDemo.Services;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.vsnpew.FileUploadDemo.Entities.Book;
import com.vsnpew.FileUploadDemo.Repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class FileUploadService {

    @Autowired
    private BookRepo bookRepo;


    public String fileUpload(MultipartFile file) throws IllegalStateException, IOException {

        String filePath = "E:\\JAva\\Upload\\" + file.getOriginalFilename(); //адрес изменить
        file.transferTo(new File(filePath));
        File file2 = new File(filePath);
        Scanner scan = new Scanner(file2);

        String bookText = "";

        while (scan.hasNextLine()) {
            bookText = bookText.concat(scan.nextLine() + System.lineSeparator());
        }
        Book book = new Book(1, bookText);
        bookRepo.save(book);

        return  bookText;
    }

    public void saveBook(Book book) {
        bookRepo.save(book);
    }

//    public void saveTest(Integer num, List<String> result) {
//        bookRepo.save(new Book(num, result));
//    }

    public String addBook() {
        return "photos";
    }
}
