package pl.oskarpolak.firstSpringApp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.oskarpolak.firstSpringApp.models.CreditForm;

@Controller
public class MainController {

    @GetMapping("/form")
    public String form(Model model){
        CreditForm creditForm = new CreditForm();
        model.addAttribute("creditObject", creditForm);
        return "creditForm";
    }

    @PostMapping("/form")
    public String form(@ModelAttribute CreditForm creditForm,
                       Model model){
        model.addAttribute("getCredit", (creditForm.getSalary() - creditForm.getExpenses()) > creditForm.getCreditAmount() / creditForm.getCreditTime() * 1.3);
        return "creditForm";
    }

}
