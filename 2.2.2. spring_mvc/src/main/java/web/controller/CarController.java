package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> carsList;

    @GetMapping(value = "/list1")
    public String printCar(ModelMap model) {
        carsList = new ArrayList<>();
        carsList.add(new Car("BMW", 333, "Black"));
        carsList.add(new Car("Audi", 999, "Blue"));
        carsList.add(new Car("Mercedes-Benz", 666, "White"));
        model.addAttribute("carBMWMark", carsList.get(0).getMark());
        model.addAttribute("carBMWSeries", carsList.get(0).getSeries());
        model.addAttribute("carBMWColor", carsList.get(0).getColor());
        return "index";
    }

    @GetMapping("/cars")
    public String printListOfCars(@RequestParam("locale")String s, ModelMap model) {
        printModelRu(s, model);
        carsList = new ArrayList<>();
        carsList.add(new Car("Dodge", 111, "Brown"));
        carsList.add(new Car("Ferrari", 100, "Red"));
        carsList.add(new Car("Lexus", 101, "Grey"));
        model.addAttribute("list_cars", carsList);
        return "cars";
    }


    public String printModelRu(String s, ModelMap model) {
        if (s.equals("ru")) {
            model.addAttribute("header_cars", "МАШИНЫ");
            model.addAttribute("head_table1", "Марка");
            model.addAttribute("head_table2", "Серия");
            model.addAttribute("head_table3", "Цвет");
        } else if (s.equals("en")) {
            model.addAttribute("header_cars", "CARS");
            model.addAttribute("head_table1", "Mark");
            model.addAttribute("head_table2", "Series");
            model.addAttribute("head_table3", "Color");
        }
        return "cars";
    }


}
