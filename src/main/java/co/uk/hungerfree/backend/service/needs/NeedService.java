package co.uk.hungerfree.backend.service.needs;

import co.uk.hungerfree.backend.model.need.entity.Need;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NeedService {

    public List<Need> findAll() throws JsonProcessingException;

    public void saveAll(List<Need> needList);

    public Need getById(String id);
}





