package co.uk.hungerfree.backend.service.needs;

import co.uk.hungerfree.backend.model.need.entity.Need;
import co.uk.hungerfree.backend.repository.NeedRepository;
import co.uk.hungerfree.backend.service.needs.NeedService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeedServiceImpl implements NeedService {

    private NeedRepository needRepository;

    @Autowired
    public NeedServiceImpl(NeedRepository needRepository) {
        this.needRepository = needRepository;
    }


    @Override
    public List<Need> findAll() throws JsonProcessingException {
        return needRepository.findAll();
    }

    @Override
    public void saveAll(List<Need> needsList) {
        needRepository.saveAll(needsList);
    }

    @Override
    public Need getById(String id) {
        return needRepository.getById(id);
    }


}
