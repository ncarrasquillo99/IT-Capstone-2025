package org.example.orlandocomputers;

import org.example.orlandocomputers.model.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @Autowired
    private org.example.orlandocomputers.SubscriberRepository subscriberRepository;

    @GetMapping("/")
    public String index() {
        return "Viewer"; // Viewer.html (ensure this is the correct file name)
    }
    @GetMapping("/Services")
    public String services() {
        return "Services";
    }
    @GetMapping("/Map")
    public String map() {

        return "Map";
    }

    @GetMapping("/Viewer")
    public String viewer() {
        return "Viewer";
    }

    @PostMapping("/subscribe")
    public String subscribe(Subscriber subscriber, Model model) {
        subscriberRepository.save(subscriber); // Save the subscriber to MySQL DB
        model.addAttribute("message", "Thank you for subscribing!");
        return "Viewer"; // Return to the same page with a success message

    }

    @GetMapping("/Product")
    public String product() {
        return "Product";

    }


}
