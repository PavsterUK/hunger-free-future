package co.uk.hungerfree.backend.service.town.fnder;

import co.uk.hungerfree.backend.model.TownFinder;
import co.uk.hungerfree.backend.repository.TownFinderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TownFinderServiceImpl implements TownFinderService {

    private final TownFinderRepository townFinderRepository;

    @Autowired
    public TownFinderServiceImpl(TownFinderRepository townFinderRepository) {
        this.townFinderRepository = townFinderRepository;
    }

    @Override
    public void saveAll(List<TownFinder> townFinderList) {
        townFinderRepository.saveAll(townFinderList);
    }

    @Override
    public List<Map<String, String>> findByNameContains(String name) {
        System.out.println("inside servImpl " + name);
        return townFinderRepository.findByNameContains(name);
    }
}
