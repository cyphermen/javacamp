package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.CreateProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.DeleteProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.GetByIdProgramingLanguagesRequest;
import Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests.UpdateProgramingLanguagesRequest;
import Kodlama.io.Devs.business.responses.programingLanguagesResponses.GetAllProgramingLanguagesResponse;
import Kodlama.io.Devs.business.responses.programingLanguagesResponses.GetByIdProgramingLanguagesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programinglanguages")
public class ProgramingLanguagesController {
    private ProgramingLanguagesService programingLanguagesService;

    @Autowired
    public ProgramingLanguagesController(ProgramingLanguagesService programingLanguagesService) {
        this.programingLanguagesService = programingLanguagesService;
    }

    @GetMapping("/getall")
    public List<GetAllProgramingLanguagesResponse> getAll() {
        return programingLanguagesService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateProgramingLanguagesRequest createProgramingLanguagesRequest) throws Exception {
        programingLanguagesService.add(createProgramingLanguagesRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteProgramingLanguagesRequest deleteProgramingLanguagesRequest) {
        programingLanguagesService.delete(deleteProgramingLanguagesRequest);
    }


    @GetMapping("/getbyid")
    public GetByIdProgramingLanguagesResponse getById(GetByIdProgramingLanguagesRequest getByIdProgramingLanguagesRequest) {

        return programingLanguagesService.getById(getByIdProgramingLanguagesRequest);
    }

    @PutMapping("/update")
    public void update(UpdateProgramingLanguagesRequest updateProgramingLanguagesRequest) throws Exception {
        programingLanguagesService.update(updateProgramingLanguagesRequest);
    }
}
