package org.launchcode.happyhour.controllers;

import org.launchcode.happyhour.models.Search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "Happy Hour");
        model.addAttribute("search", new Search());
        return "index";
    }

    @GetMapping("search")
    public String displaySearchResults(Model model) {
        model.addAttribute("title", "Search");
        model.addAttribute("search", new Search());
//        model.addAttribute("location_1", GET("https://api.mapbox.com/geocoding/v5/mapbox.places/address.json?access_token=pk.eyJ1IjoiY2xsZWZsZXIiLCJhIjoiY2tleTJhNmhsMzR4eDJxbGdhcDdsNDRreCJ9.Zdsf442gpmjgV7ZMsdFZwA"));
        return "search";
    }

    @PostMapping("search")
    public String processSearchForm(@ModelAttribute Search newSearch, Model model) {
        System.out.println(newSearch);
        return "search";
    }


}
