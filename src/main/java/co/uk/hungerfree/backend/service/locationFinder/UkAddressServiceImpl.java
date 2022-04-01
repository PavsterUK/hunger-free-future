package co.uk.hungerfree.backend.service.locationFinder;

import co.uk.hungerfree.backend.model.UkAddress;
import co.uk.hungerfree.backend.repository.UkAddressRepository;
import co.uk.hungerfree.backend.service.locationFinder.UkAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UkAddressServiceImpl implements UkAddressService {

    private final UkAddressRepository ukAddressRepository;

    @Autowired
    public UkAddressServiceImpl(UkAddressRepository ukAddressRepository) {
        this.ukAddressRepository = ukAddressRepository;
    }

    @Override
    public void saveAll(List<UkAddress> ukAddressList) {
        ukAddressRepository.saveAll(ukAddressList);
    }
}
