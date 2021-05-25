package com.vsnpew.FileUploadDemo.Entities;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Data
public class Book {
    @Id()
    private Integer id;
    private String bookText;


    public Book(Integer id, String bookText) {
        this.id = id;
        this.bookText = bookText;
    }

    public Book(String bookText) {
        this.bookText = bookText;
    }
}
