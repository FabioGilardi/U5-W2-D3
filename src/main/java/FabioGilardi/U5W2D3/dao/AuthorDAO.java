package FabioGilardi.U5W2D3.dao;

import FabioGilardi.U5W2D3.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDAO extends JpaRepository<Author, Long> {
    boolean existsByEmail(String email);
}
