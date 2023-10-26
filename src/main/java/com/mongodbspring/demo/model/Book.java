package com.mongodbspring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")
public class Book {
    // Attributes
    @Id
    private String  id;
    private String bookName;
    private String authorName;
    private String email;
    private Date registered;
    private String description;

}
