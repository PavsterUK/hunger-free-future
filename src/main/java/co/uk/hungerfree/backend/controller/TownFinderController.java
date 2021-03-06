package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.service.town.fnder.TownFinderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/api")
public class TownFinderController {

    private final TownFinderServiceImpl townFinderServiceImpl;

    @Autowired
    public TownFinderController(TownFinderServiceImpl townFinderServiceImpl) {
        this.townFinderServiceImpl = townFinderServiceImpl;
    }

    @GetMapping("/find-town/{name}")
    public List<Map<String, String>> findByNameContains(@PathVariable(value = "name") String name) {
        return townFinderServiceImpl.findByNameContains(name);
    }
}
