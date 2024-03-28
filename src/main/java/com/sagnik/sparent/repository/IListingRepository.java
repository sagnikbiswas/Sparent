package com.sagnik.sparent.repository;

import com.sagnik.sparent.model.Listing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IListingRepository extends CrudRepository<Listing, Long> {
    public Iterable<Listing> findAll();
    public Listing save(Listing listing);
}
