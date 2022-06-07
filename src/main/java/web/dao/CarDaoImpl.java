package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;


public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1L, "Mercedes-Benz", "E350", 30000));
        cars.add(new Car(2L, "Audi", "S6", 38000));
        cars.add(new Car(3L, "BMW", "530-M", 37000));
        cars.add(new Car(4L, "Porsche", "Panamera", 50000));
        cars.add(new Car(5L, "Maserati ", "Quattroporte", 45000));
    }

    @Override
    public List<Car> showCars(int count) {
        if (count >= cars.size()) return cars;
        return cars.stream()
                .limit(count)
                .toList();
    }
}
