package pl.oskarpolak.firstSpringApp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/form")
    public String form(){
        return "creditForm";
    }

    @PostMapping("/form")
    public String form(@RequestParam("salary") int salary,
                       @RequestParam("currentCredits") int currentCredits,
                       @RequestParam("creditAmount") int creditAmount,
                       @RequestParam("creditTime") int creditTime,
                       Model model){
        model.addAttribute("getCredit", (salary - currentCredits) > creditAmount / creditTime * 1.3);
        return "creditForm";
    }

}
