package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarServiceImpl;


@Controller
@RequestMapping(value = "/cars")
public class CarController {

    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count,
                           Model model) {
        model.addAttribute("cars", carService.showCars(count));
        return "cars";
    }
}
