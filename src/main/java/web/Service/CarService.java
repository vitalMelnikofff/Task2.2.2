package web.Service;
import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Focus", 2021));
        cars.add(new Car("Toyota", "Camry", 2022));
        cars.add(new Car("Honda", "Civic", 2020));
        cars.add(new Car("BMW", "X5", 2019));
        cars.add(new Car("Lada", "Vesta", 2023));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCarsByCount(int count) {
        if (count >= cars.size()) {
            return new ArrayList<>(cars);
        } else {
            return new ArrayList<>(cars.subList(0, count));
        }
    }
}