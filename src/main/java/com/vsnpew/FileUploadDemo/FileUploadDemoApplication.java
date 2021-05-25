package com.vsnpew.FileUploadDemo;

import com.vsnpew.FileUploadDemo.Entities.Book;
import com.vsnpew.FileUploadDemo.Repos.BookRepo;
import com.vsnpew.FileUploadDemo.Services.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@SpringBootApplication
public class FileUploadDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(FileUploadDemoApplication.class, args);
    }


}
