package com.mongodbspring.demo.repository;
import com.mongodbspring.demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BookRepo extends MongoRepository<Book, Integer>{
}
