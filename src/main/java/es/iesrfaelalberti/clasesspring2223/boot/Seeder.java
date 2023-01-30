package es.iesrfaelalberti.clasesspring2223.boot;

import es.iesrfaelalberti.clasesspring2223.models.Cell;
import es.iesrfaelalberti.clasesspring2223.models.Prisoner;
import es.iesrfaelalberti.clasesspring2223.repositories.CellRepository;
import es.iesrfaelalberti.clasesspring2223.repositories.PrisonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    @Autowired
    PrisonerRepository prisonerRepository;

    @Autowired
    CellRepository cellRepository;

    @Override
    public void run(String...args) {
        Cell cell1 = cellRepository.save(new Cell(1, 32F,25));
        Cell cell2 = cellRepository.save(new Cell(2, 8.5f, 12));
        prisonerRepository.save(new Prisoner("yo", 20 , 2 , cell1));
        prisonerRepository.save(new Prisoner("Manolo", 1 ,34, cell1));
        prisonerRepository.save(new Prisoner("Umberto", 34, 3, cell2));

    }
}
