package es.iesrfaelalberti.clasesspring2223.repositories;

import es.iesrfaelalberti.clasesspring2223.models.Cell;
import org.springframework.data.repository.CrudRepository;

public interface CellRepository extends CrudRepository<Cell, Long> {
}
