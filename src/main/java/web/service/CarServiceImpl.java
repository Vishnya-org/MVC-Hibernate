package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = carDao.getCars();
        List<Car> responseCars = new ArrayList<>();

        int updCount = Math.min(count, cars.size());
        for (int i = 0; i < updCount; i++) {
            responseCars.add(cars.get(i));
        }
        return responseCars;
    }
}
