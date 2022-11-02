package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;
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
    public List<ProgramingLanguages> getAll(){
       return programingLanguagesService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgramingLanguages programingLanguages) throws Exception {
        programingLanguagesService.add(programingLanguages);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        programingLanguagesService.delete(id);
    }

    @GetMapping("/getbyid/{id}")
    public ProgramingLanguages getById(@PathVariable int id){
        return  programingLanguagesService.getById(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id,@RequestBody ProgramingLanguages programingLanguages) throws Exception {
        programingLanguagesService.update(id,programingLanguages);
    }
}