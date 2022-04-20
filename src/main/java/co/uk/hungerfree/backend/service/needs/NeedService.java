package co.uk.hungerfree.backend.service.needs;

import co.uk.hungerfree.backend.model.need.Need;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NeedService {

    public void saveAll(List<Need> needList);

}





