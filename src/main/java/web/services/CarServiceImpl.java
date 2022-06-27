package web.services;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;


@Component
public class CarServiceImpl implements CarService {
    private CarDao carDaoImpl = new CarDaoImpl();

    @Override
    public List<Car> showCars(int count) {
        return carDaoImpl.showCars(count);
    }
}
