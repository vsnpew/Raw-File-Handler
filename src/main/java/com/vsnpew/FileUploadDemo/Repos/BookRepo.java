package com.vsnpew.FileUploadDemo.Repos;

import com.vsnpew.FileUploadDemo.Entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends MongoRepository<Book, Integer > {
}
