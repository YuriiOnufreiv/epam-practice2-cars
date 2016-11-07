package project.practice.car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by victor on 04.11.16.
 */
public class Runner {
    public static void main(String[] args) {
        List<Car> testCars = new ArrayList<>();
        CarSearch carSearch = new CarService();

        initTestData(testCars);

        System.out.println(carSearch.findCarsByModelAndExpYears(testCars, "test", 1));
        System.out.println(carSearch.findCarsByBrand(testCars, Brand.FORD));
        System.out.println(carSearch.findCarsByBrandByMadeYearAndPrice(testCars, 2010, 500));
    }

    private static void initTestData(List<Car> testCars) {
        testCars.add(new Car(
                1,
                Brand.TOYOTA,
                "test",
                2012,
                Color.BLACK,
                1474.3,
                "34775ab"
        ));
        testCars.add(new Car(
                2,
                Brand.FORD,
                "test1",
                2010,
                Color.WHITE,
                1375.3,
                "344353ab"
        ));
        testCars.add(new Car(
                1,
                Brand.VOLKSWAGEN,
                "test3",
                2008,
                Color.YELLOW,
                888.66,
                "33235aa"
        ));
        testCars.add(new Car(
                5,
                Brand.VOLKSWAGEN,
                "test3",
                2003,
                Color.YELLOW,
                500,
                "33235aa"
        ));

    }
}
