package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.technologyRequests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.technologyResponses.GetTechnologyResponse;
import Kodlama.io.Devs.business.responses.technologyResponses.GetAllTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
    private TechnologyService technologyService;

    @Autowired
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("/getall")
    public List<GetAllTechnologyResponse> getAll() {
        return technologyService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateTechnologyRequest createTechnologyRequest) throws Exception {
        technologyService.add(createTechnologyRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteTechnologyRequest deleteTechnologyRequest) {
        technologyService.delete(deleteTechnologyRequest);
    }


    @PutMapping("/update")
    public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
        technologyService.update(updateTechnologyRequest);
    }

    @GetMapping("/getByProgrammingLanguageId")
    public List<GetTechnologyResponse> findByProgrammingLanguageId(int programingLanguageId) {
        return technologyService.findByProgrammingLanguageId(programingLanguageId);
    }
}
