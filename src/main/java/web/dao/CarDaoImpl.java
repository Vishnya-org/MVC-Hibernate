package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    {
        cars = List.of(
                new Car("Tesla Model 3", 2016, "Red"),
                new Car("Tesla Cybertruck", 2019, "Stainless Steel"),
                new Car("Tesla Roadster", 2006, "Silver"),
                new Car("Tesla Model S", 2009, "Black"),
                new Car("Tesla Model X", 2012, "White"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
