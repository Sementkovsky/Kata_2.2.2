package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;


@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("listCars", carService.carsSet(count));
        return "cars";
    }
}