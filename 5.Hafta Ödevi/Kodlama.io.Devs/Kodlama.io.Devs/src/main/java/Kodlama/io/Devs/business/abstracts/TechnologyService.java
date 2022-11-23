package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.requests.technologyRequests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.technologyResponses.GetTechnologyResponse;
import Kodlama.io.Devs.business.responses.technologyResponses.GetAllTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologyResponse> getAll();

    public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;

    public void delete(DeleteTechnologyRequest deleteTechnologyRequest);

    public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception;

    List<GetTechnologyResponse> findByProgrammingLanguageId(int programingLanguageId);

}
