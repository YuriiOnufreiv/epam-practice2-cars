package project.practice.car;

import java.util.List;

/**
 * Created by victor on 04.11.16.
 */
public interface CarSearch {
    List<Car> findCarsByBrand(List<Car> cars, Brand brand);

    List<Car> findCarsByModelAndExpYears(List<Car> cars, String model, int year);

    List<Car> findCarsByBrandByMadeYearAndPrice(List<Car> cars, int madeYear, double price);
}
