package com.vsnpew.FileUploadDemo.Repos;

import com.vsnpew.FileUploadDemo.Entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Book, Integer> {

}
