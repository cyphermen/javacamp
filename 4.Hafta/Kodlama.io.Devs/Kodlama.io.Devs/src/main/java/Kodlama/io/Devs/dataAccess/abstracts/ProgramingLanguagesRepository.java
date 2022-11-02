package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;

import java.util.List;

public interface ProgramingLanguagesRepository {
    List<ProgramingLanguages> getAll();
    public void add(ProgramingLanguages programingLanguages) throws Exception;
    public void delete(int id);
    public void update(int id,ProgramingLanguages programingLanguages) throws Exception;
    ProgramingLanguages getById(int id);
}
