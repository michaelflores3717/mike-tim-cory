package com.example.symbri.controllers;

import com.example.symbri.models.Profile;
import com.example.symbri.models.StringGenerator;
import com.example.symbri.repositories.Profiles;
import com.example.symbri.repositories.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {

    @Autowired
    private Users users;
    private Profiles profiles;

    public ProfileController(Profiles profiles) {
        this.profiles = profiles;
    }

    @GetMapping("/add/customer")
    public String getNewCustomerForm(Model model) {
        model.addAttribute("profile", new Profile());
        return "add-customer";
    }

    @PostMapping("/add/customer")
    public String addNewCustomer(@ModelAttribute Profile profile){
        StringGenerator stringGenerator = new StringGenerator();
        String randomId = stringGenerator.generateString(20);
        profile.setRandomIdentifier(randomId);
        profiles.save(profile);
        return "redirect:/add/customer";
    }
}
