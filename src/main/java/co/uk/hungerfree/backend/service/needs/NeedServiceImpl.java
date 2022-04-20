package co.uk.hungerfree.backend.service.needs;

import co.uk.hungerfree.backend.model.need.Need;
import co.uk.hungerfree.backend.repository.NeedRepository;
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
    public void saveAll(List<Need> needsList) {
        needRepository.saveAll(needsList);
    }

}
