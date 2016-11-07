package project.practice.car;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by victor on 04.11.16.
 */
public class CarService implements CarSearch {
    @Override
    public List<Car> findCarsByBrand(List<Car> cars, Brand brand) {
        List<Car> foundCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    @Override
    public List<Car> findCarsByModelAndExpYears(List<Car> cars, String model, int year) {
        List<Car> searchResult = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model)
                    && Calendar.getInstance().get(Calendar.YEAR) - car.getMadeYear() > year) {
                searchResult.add(car);
            }
        }
        return searchResult;
    }

    @Override
    public List<Car> findCarsByBrandByMadeYearAndPrice(List<Car> cars, int madeYear, double price) {
        List<Car> foundCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPrice() > price && car.getMadeYear() == madeYear) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
}
