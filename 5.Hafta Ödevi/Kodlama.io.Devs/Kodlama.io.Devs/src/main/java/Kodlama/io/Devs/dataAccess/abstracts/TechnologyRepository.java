package Kodlama.io.Devs.dataAccess.abstracts;


import Kodlama.io.Devs.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}
