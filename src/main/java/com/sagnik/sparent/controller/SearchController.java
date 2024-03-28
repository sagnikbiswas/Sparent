package com.sagnik.sparent.controller;

import com.sagnik.sparent.model.Listing;
import com.sagnik.sparent.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search/")
public class SearchController {

    private SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping
    public Iterable<Listing> getAllListings() {
        return searchService.getAllListings();
    }
}
