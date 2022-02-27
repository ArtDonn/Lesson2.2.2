package web.service;

import web.model.Car;

import java.util.List;

public interface CarServise {
    List<Car> show(int count);
    List<Car> show();
}
