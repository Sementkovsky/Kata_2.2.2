package web.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class CarServiceImpl implements CarService {

    Car car1 = new Car("Peugeot", "3008", 195);
    Car car2 = new Car("Porsche", "Boxter", 229);
    Car car3 = new Car("Lada", "2106", 154);
    Car car4 = new Car("Citroen", "C4 Picasso", 189);
    Car car5 = new Car("Audi", "A5", 209);

    private CarDAO dao = new CarDAOImpl();
    private List<Car> carList = new ArrayList<Car>();


    public List<Car> carsSet(int number) {
        return dao.getCarSet(number);
    }
}
