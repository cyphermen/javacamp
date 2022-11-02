package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguagesRepository;
import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgramingLanguagesRepository implements ProgramingLanguagesRepository {

    List<ProgramingLanguages> programingLanguages;

    public InMemoryProgramingLanguagesRepository() {
        programingLanguages = new ArrayList<ProgramingLanguages>();
        programingLanguages.add(new ProgramingLanguages(1,"Java"));
        programingLanguages.add(new ProgramingLanguages(2,"C#"));
        programingLanguages.add(new ProgramingLanguages(3,"Python"));
    }

    @Override
    public List<ProgramingLanguages> getAll() {
        return programingLanguages;
    }

    @Override
    public void add(ProgramingLanguages programingLanguage) throws Exception {
        if(programingLanguage.getName().isEmpty() || programingLanguage.getName().isBlank()) {
            throw new Exception("Lütfen bir değer giriniz..");

        }
        programingLanguages.add(programingLanguage);

    }

   @Override
   public void delete(int id) {
        for(ProgramingLanguages languages:programingLanguages){
            if(languages.getId() ==id){

                programingLanguages.remove(programingLanguages.indexOf(languages));
            }
        }
    }

    @Override
    public void update(int id,ProgramingLanguages programingLanguages1) throws Exception {
        if(programingLanguages1.getName().isEmpty() || programingLanguages1.getName().isBlank()) {
            throw new Exception("Lütfen bir değer giriniz..");

        }
        for (ProgramingLanguages language:programingLanguages){
            if(language.getId() ==id){
                language.setName(programingLanguages1.getName());
            }
        }
    }

    @Override
    public ProgramingLanguages getById(int id) {
        for(ProgramingLanguages language:programingLanguages){
            if (language.getId()==id){
                return language;
            }
        }

        return null;
    }
}
