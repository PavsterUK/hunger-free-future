package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.model.entities.needEntity.Need;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NeedService {

    public String listAll() throws JsonProcessingException;

    public void saveAll(List<Need> needList);

    public List<Need> getFoodBanksByIds(List<String> ids);
}





