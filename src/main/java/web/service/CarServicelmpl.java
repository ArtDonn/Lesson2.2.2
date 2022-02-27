package web.service;

import org.springframework.stereotype.Controller;
import web.model.Car;
import web.service.CarServise;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarServicelmpl implements CarServise {
    private final List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(1,"Lada", "Red", 2007));
        car.add(new Car(2,"Tesla", "Black", 2022));
        car.add(new Car(3,"Ford", "Blue", 2010));
        car.add(new Car(4,"BMW", "Black", 2020));
        car.add(new Car(5,"Mercedes", "White", 2018));
    }

    @Override
    public List<Car> show(int id) {
        if (id < 5) {
            return car.stream().limit(id).collect(Collectors.toList());
        }
        return car;
    }

    @Override
    public List<Car> show() {
        return car;
    }
}