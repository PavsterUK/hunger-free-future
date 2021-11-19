package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.domain.Need;
import co.uk.hungerfree.backend.repository.NeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeedService {

    private static NeedRepository needRepositor;

    @Autowired
    public NeedService(NeedRepository needRepositor) {
        NeedService.needRepositor = needRepositor;
    }

    public NeedService() {

    }

    public static void saveAll(List<Need> needList) {
        needRepositor.saveAll(needList);
    }
}





