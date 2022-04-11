package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.model.need.entity.Need;
import co.uk.hungerfree.backend.service.needs.NeedServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("https://hunger-free-future.herokuapp.com/v1/api")
public class NeedController {

    NeedServiceImpl needServiceImpl;

    @Autowired
    public NeedController(NeedServiceImpl needServiceImpl) {
        this.needServiceImpl = needServiceImpl;
    }

    @GetMapping("/needs")
    public List<Need> all() throws JsonProcessingException {
        return needServiceImpl.findAll();
    }

    @GetMapping("/needs/{slug}")
    public Need getBySlug(@PathVariable String slug) {
        return needServiceImpl.getById(slug);
    }
}
