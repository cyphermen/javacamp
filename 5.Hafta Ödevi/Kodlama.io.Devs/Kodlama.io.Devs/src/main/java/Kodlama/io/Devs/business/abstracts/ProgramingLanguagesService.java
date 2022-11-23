package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.CreateProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.DeleteProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.GetByIdProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.UpdateProgramingLanguagesRequest;
import Kodlama.io.Devs.business.responses.programingLanguagesResponses.GetAllProgramingLanguagesResponse;
import Kodlama.io.Devs.business.responses.programingLanguagesResponses.GetByIdProgramingLanguagesResponse;

import java.util.List;

public interface ProgramingLanguagesService {
    List<GetAllProgramingLanguagesResponse> findAll();

    public void add(CreateProgramingLanguagesRequest createProgramingLanguagesRequest) throws Exception;

    public void delete(DeleteProgramingLanguagesRequest deleteProgramingLanguagesRequest);

    public void update(UpdateProgramingLanguagesRequest updateProgramingLanguagesRequest) throws Exception;

    public GetByIdProgramingLanguagesResponse getById(GetByIdProgramingLanguagesRequest getByIdProgramingLanguagesRequest);
}
