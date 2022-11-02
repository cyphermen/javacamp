package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguagesRepository;
import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramingLanguagesManager implements ProgramingLanguagesService {

    ProgramingLanguagesRepository programingLanguagesRepository;

    @Autowired
    public ProgramingLanguagesManager(ProgramingLanguagesRepository programingLanguagesRepository) {
        this.programingLanguagesRepository = programingLanguagesRepository;
    }


    @Override
    public List<ProgramingLanguages> getAll() {
        return programingLanguagesRepository.getAll();
    }

    @Override
    public void add(ProgramingLanguages programingLanguages) throws Exception {
        programingLanguagesRepository.add(programingLanguages);

    }

    @Override
    public void delete(int id) {
        programingLanguagesRepository.delete(id);
    }

    @Override
    public void update(int id, ProgramingLanguages programingLanguages) throws Exception {
        programingLanguagesRepository.update(id, programingLanguages);
    }

    @Override
    public ProgramingLanguages getById(int id) {
        return programingLanguagesRepository.getById(id);
    }
}
