package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.jsonparsing.Json;
import co.uk.hungerfree.backend.model.entities.needEntity.Need;
import co.uk.hungerfree.backend.repository.NeedRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeedServiceImpl implements NeedService {

    NeedRepository needRepository;

    @Autowired
    public NeedServiceImpl(NeedRepository needRepository) {
        this.needRepository = needRepository;
    }


    @Override
    public String listAll() throws JsonProcessingException {

        JsonNode node = Json.toJson(needRepository.findAll());

        return Json.stringify(node);
    }

    @Override
    public void saveAll(List<Need> needList) {
        needRepository.saveAll(needList);
    }

    @Override
    public List<Need> getFoodBanksByIds(List<String> ids) {
        return null;
    }


}
