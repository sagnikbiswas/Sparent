package com.sagnik.sparent.service;

import com.sagnik.sparent.model.Listing;
import com.sagnik.sparent.repository.IListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;

@Service
public class SearchService {

    private IListingRepository listingRepo;

    @Autowired
    public SearchService(IListingRepository listingRepo) {
        this.listingRepo = listingRepo;
    }
    public Iterable<Listing> getAllListings() {

        // test data
        Listing l1 = new Listing();
        l1.setName("ABC PG");
        l1.setPrice(BigDecimal.valueOf(10000));
        Listing l2 = new Listing();
        l2.setName("XYZ Villa");
        l2.setPrice(BigDecimal.valueOf(150000));
        listingRepo.save(l2);
        return listingRepo.findAll();
    }
}
