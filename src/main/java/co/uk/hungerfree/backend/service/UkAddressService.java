package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.model.UkAddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UkAddressService {

    void saveAll(List<UkAddress> ukAddressList);

}
