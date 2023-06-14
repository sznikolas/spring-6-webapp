package nikolas.springframework.spring6webapp.services;

import nikolas.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
