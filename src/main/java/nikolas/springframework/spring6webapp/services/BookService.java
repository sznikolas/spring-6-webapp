package nikolas.springframework.spring6webapp.services;

import nikolas.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
