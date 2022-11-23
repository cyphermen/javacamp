package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.CreateProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.DeleteProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.GetByIdProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.UpdateProgramingLanguagesRequest;
import Kodlama.io.Devs.business.responses.programingLanguagesResponses.GetAllProgramingLanguagesResponse;
import Kodlama.io.Devs.business.responses.programingLanguagesResponses.GetByIdProgramingLanguagesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguagesRepository;
import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramingLanguagesManager implements ProgramingLanguagesService {

    ProgramingLanguagesRepository programingLanguagesRepository;

    public ProgramingLanguagesManager() {
    }

    @Autowired
    public ProgramingLanguagesManager(ProgramingLanguagesRepository programingLanguagesRepository) {
        this.programingLanguagesRepository = programingLanguagesRepository;
    }


    @Override
    public List<GetAllProgramingLanguagesResponse> findAll() {
        List<ProgramingLanguages> programingLanguages = programingLanguagesRepository.findAll();
        List<GetAllProgramingLanguagesResponse> getAllProgramingLanguagesResponses = new ArrayList<GetAllProgramingLanguagesResponse>();

        for (ProgramingLanguages programingLanguage : programingLanguages) {

            GetAllProgramingLanguagesResponse responseItem = new GetAllProgramingLanguagesResponse();
            responseItem.setId(programingLanguage.getId());
            responseItem.setName(programingLanguage.getName());
            getAllProgramingLanguagesResponses.add(responseItem);

        }

        return getAllProgramingLanguagesResponses;
    }


    @Override
    public void add(CreateProgramingLanguagesRequest createProgramingLanguagesRequest) throws Exception {

        if (createProgramingLanguagesRequest.getName().isEmpty() || createProgramingLanguagesRequest.getName().isBlank()) {
            throw new Exception("Lütfen bir değer giriniz..");

        }

        ProgramingLanguages programingLanguages = new ProgramingLanguages();
        programingLanguages.setName(createProgramingLanguagesRequest.getName());
        this.programingLanguagesRepository.save(programingLanguages);
    }

    public GetByIdProgramingLanguagesResponse getById(GetByIdProgramingLanguagesRequest getByIdProgramingLanguagesRequest) {

        ProgramingLanguages programingLanguages = programingLanguagesRepository.findById(getByIdProgramingLanguagesRequest.getId()).get();
        GetByIdProgramingLanguagesResponse getByIdProgramingLanguagesResponse = new GetByIdProgramingLanguagesResponse();
        getByIdProgramingLanguagesResponse.setId(programingLanguages.getId());
        getByIdProgramingLanguagesResponse.setName(programingLanguages.getName());
        return getByIdProgramingLanguagesResponse;
    }

    @Override
    public void delete(DeleteProgramingLanguagesRequest deleteProgramingLanguagesRequest) {
        programingLanguagesRepository.deleteById(deleteProgramingLanguagesRequest.getId());
    }

    @Override
    public void update(UpdateProgramingLanguagesRequest updateProgramingLanguagesRequest) throws Exception {

        if (updateProgramingLanguagesRequest.getName().isEmpty() || updateProgramingLanguagesRequest.getName().isBlank()) {
            throw new Exception("Lütfen bir değer giriniz..");

        }
        ProgramingLanguages programingLanguages = programingLanguagesRepository.findById(updateProgramingLanguagesRequest.getId()).get();
        programingLanguages.setName(updateProgramingLanguagesRequest.getName());
        programingLanguagesRepository.saveAndFlush(programingLanguages);

    }


}
