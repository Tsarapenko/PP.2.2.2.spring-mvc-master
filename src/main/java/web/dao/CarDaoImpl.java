package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>() {
        {
            add (new Car(1, "model1", 1));
            add (new Car(2, "model2", 2));
            add (new Car(3, "model3", 3));
            add (new Car(4, "model4", 4));
            add (new Car(5, "model5", 5));

        }
    };
    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();

    }

}
