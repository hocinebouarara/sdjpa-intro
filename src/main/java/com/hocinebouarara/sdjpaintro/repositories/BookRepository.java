package com.hocinebouarara.sdjpaintro.repositories;

import com.hocinebouarara.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
