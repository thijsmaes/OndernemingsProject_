package OndernemingsProject.data.jpa.restControllers;

import OndernemingsProject.data.jpa.domain.City;
import OndernemingsProject.data.jpa.service.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CityRestController {

    @Autowired
    CityRepository cityRepository;

    @RequestMapping("/cities")
    Collection<City> cities(){
        return this.cityRepository.findAll();
    }

}
