package com.heldut.bookstoremanager.repository;
import com.heldut.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<Book, Long> {
}
