package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.technologyRequests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.technologyResponses.GetTechnologyResponse;
import Kodlama.io.Devs.business.responses.technologyResponses.GetAllTechnologyResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguagesRepository;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;
import Kodlama.io.Devs.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {
    TechnologyRepository TechnologyRepository;
    ProgramingLanguagesRepository programingLanguagesRepository;


    @Autowired
    public TechnologyManager(TechnologyRepository TechnologyRepository, ProgramingLanguagesRepository programingLanguagesRepository) {
        this.TechnologyRepository = TechnologyRepository;
        this.programingLanguagesRepository = programingLanguagesRepository;
    }

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = TechnologyRepository.findAll();
        List<GetAllTechnologyResponse> getAllTechnologyResponses = new ArrayList<GetAllTechnologyResponse>();

        for (Technology technology : technologies) {
            GetAllTechnologyResponse getAllTechnologyResponse = new GetAllTechnologyResponse();
            getAllTechnologyResponse.setId(technology.getId());
            getAllTechnologyResponse.setName(technology.getName());
            getAllTechnologyResponse.setProgramingLanguageName(technology.getProgramingLanguages().getName());
            getAllTechnologyResponses.add(getAllTechnologyResponse);
        }

        return getAllTechnologyResponses;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
        if (createTechnologyRequest.getName().isEmpty() || createTechnologyRequest.getName().isBlank()) {
            throw new Exception("Lütfen bir değer giriniz..");
        }

        ProgramingLanguages programingLanguages = programingLanguagesRepository.findById(createTechnologyRequest.getProgramingLanguagesId()).get();

        Technology technology = new Technology();
        technology.setName(createTechnologyRequest.getName());
        technology.setProgramingLanguages(programingLanguages);
        TechnologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {

        TechnologyRepository.deleteById(deleteTechnologyRequest.getId());
    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
        if (updateTechnologyRequest.getName().isEmpty() || updateTechnologyRequest.getName().isBlank()) {
            throw new Exception("Lütfen bir değer giriniz..");

        }

        ProgramingLanguages programingLanguages = programingLanguagesRepository.findById(updateTechnologyRequest.getProgramingLanguageId()).get();
        Technology technologies = TechnologyRepository.findById(updateTechnologyRequest.getId()).get();
        technologies.setName(updateTechnologyRequest.getName());
        technologies.setProgramingLanguages(programingLanguages);
        TechnologyRepository.saveAndFlush(technologies);
    }

    public List<GetTechnologyResponse> findByProgrammingLanguageId(int programingLanguageId) {


        List<Technology> technologies = TechnologyRepository.findAll();
        List<GetTechnologyResponse> getPLanguageTechnologyResponses = new ArrayList<>();

        for (Technology technology : technologies) {

            if (technology.getProgramingLanguages().getId() == programingLanguageId) {

                GetTechnologyResponse responseItem = new GetTechnologyResponse();
                responseItem.setId(technology.getId());
                responseItem.setName(technology.getName());
                responseItem.setProgrammingLanguageId(technology.getProgramingLanguages().getId());

                getPLanguageTechnologyResponses.add(responseItem);
            }

        }

        return getPLanguageTechnologyResponses;

    }
}
