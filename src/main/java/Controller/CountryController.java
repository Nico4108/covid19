package Controller;

import Model.CountryInfo;
import com.kea.covid19.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/")
    public String Index(){
        countryService.getCountry("Denmark");
        return "index";
    }

    @GetMapping("/country")
    public String counrtyPage(){
        return "country";
    }

    @PostMapping("/country")
    public String seeCountries(@ModelAttribute CountryInfo countryInfo){
        countryService.getCountry("Denmark");
        return "country";
    }

}
