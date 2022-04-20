package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.model.need.Need;
import co.uk.hungerfree.backend.service.needs.NeedServiceImpl;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/v1/api")
public class NeedController {

    NeedServiceImpl needServiceImpl;

    @Autowired
    public NeedController(NeedServiceImpl needServiceImpl) {
        this.needServiceImpl = needServiceImpl;
    }


}
