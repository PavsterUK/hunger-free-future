package co.uk.hungerfree.backend.service.town.fnder;

import co.uk.hungerfree.backend.model.TownFinder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface TownFinderService {

    void saveAll(List<TownFinder> townFinderList);

    List<Map<String, String>> findByNameContains(String name);

}
