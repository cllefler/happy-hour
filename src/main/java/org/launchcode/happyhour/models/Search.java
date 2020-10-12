package org.launchcode.happyhour.models;

import java.util.ArrayList;
import java.util.List;

public class Search {

    private String location;

    private List<SearchTerms> searchTerms = new ArrayList<>();

    public Search(){
    }

    public Search(String location, List<SearchTerms> searchTerms) {
        this.location = location;
        this.searchTerms = (List<SearchTerms>) searchTerms;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<SearchTerms> getSearchTerms() {
        return searchTerms;
    }

    public void setSearchTerms(List<SearchTerms> searchTerms) {
        this.searchTerms = searchTerms;
    }

    @Override
    public String toString() {
        return "Search{" +
                "location='" + location + '\'' +
                ", searchTerms=" + searchTerms +
                '}';
    }
}
