package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramingLanguagesRepository extends JpaRepository<ProgramingLanguages, Integer> {

}
