package es.iesrfaelalberti.clasesspring2223.repositories;

import es.iesrfaelalberti.clasesspring2223.models.Prisoner;
import org.springframework.data.repository.CrudRepository;

public interface PrisonerRepository extends CrudRepository<Prisoner, Long> {}