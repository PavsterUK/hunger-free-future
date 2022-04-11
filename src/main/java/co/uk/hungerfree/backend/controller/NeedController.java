package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.model.need.entity.Need;
import co.uk.hungerfree.backend.service.needs.NeedServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://625483720ca58d0009eeb1c9--fantastic-strudel-956d59.netlify.app")
@RestController
@RequestMapping("/v1/api")
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
