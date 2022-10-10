package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    Car car1 = new Car("Peugeot", "3008", 195);
    Car car2 = new Car("Porsche", "Boxter", 229);
    Car car3 = new Car("Lada", "2106", 154);
    Car car4 = new Car("Citroen", "C4 Picasso", 189);
    Car car5 = new Car("Audi", "A5", 209);

    private List<Car> carList = new ArrayList<Car>();

    {
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    public List<Car> getCarSet(int number) {
        return carList.subList(0, number > 5 ? 5 : number);
    }
}



