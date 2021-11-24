package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.model.Need;
import co.uk.hungerfree.backend.repository.NeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeedService {

    private NeedRepository needRepository;

    @Autowired
    public NeedService(NeedRepository needRepository) {
        this.needRepository = needRepository;
    }

    public NeedService() {

    }

    public void saveAll(List<Need> needList) {
        needRepository.saveAll(needList);
    }
}





