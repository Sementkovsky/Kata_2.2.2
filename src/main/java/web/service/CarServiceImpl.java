package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO dao;

    @Autowired
    public CarServiceImpl(CarDAO dao) {
        this.dao = dao;
    }

    public List<Car> carsSet(int number) {
        return dao.getCarSet(number);
    }
}
