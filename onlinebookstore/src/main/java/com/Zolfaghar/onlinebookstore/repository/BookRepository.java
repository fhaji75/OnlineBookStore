package com.Zolfaghar.onlinebookstore.repository;

import com.Zolfaghar.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
