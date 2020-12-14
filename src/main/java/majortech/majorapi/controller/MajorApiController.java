package majortech.majorapi.controller;

import majortech.majorapi.model.MajorApiModel;
import majortech.majorapi.repository.MajorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MajorApiController {
    private MajorRepository major;

    @GetMapping(path = "/api/status")
    public boolean isActive(){
        return true;
    }

    @GetMapping(path = "/api/major/(id)")
    public ResponseEntity checkId(@PathVariable("id")int id){
        return this.major.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/major/save")
    public MajorApiModel saveMajor(@RequestBody MajorApiModel major){
        return this.major.save(major);
    }

}
